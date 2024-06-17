# Notes

To view the contents of a `.db` file, instead of using `adb shell` and numerous unknown commands, utilize built-in tools. Go to `Tools` > `App Inspection`, and you will have a powerful visualization tool to simplify your life.

Basically, there are three ways of storing information. Storing it in a `.txt` file, however, is deprecated by me because it is outdated.

The second way, which involves using `SharedPreferences`, is indeed a great method for storing information. It stores data in a key-value pair, making data storage and retrieval much simpler. Use `put` and `get` to write and read.

## Practical 8

Here's the corrected text with grammatical errors addressed:

### 1 - Resolve `requestPermissions` issues

If you are using the following code in `Practical8.pdf`, you might encounter an error; your application might not be able to request the permission, that is, to pop up a square box and prompt the user to allow specific permissions.

```java
if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
    if (checkSelfPermission(Manifest.permission.READ_MEDIA_IMAGES)
            != PackageManager.PERMISSION_GRANTED) {
        requestPermissions(new String[] {
                        Manifest.permission.READ_MEDIA_IMAGES},
                MY_PERMISSIONS_REQUEST_READ_MEDIA_IMAGES);
        return ;
    }
}
```

There are some underlying causes. The first is that the app has already acquired the permissions it needs. To check this, go to `Settings` > `App & Notifications` > `Your app` and check for the permission. If the app has acquired the necessary permissions, then don't worry about the permission issue.

The second cause could be a missing declaration in `AndroidManifest.xml`. Remember to include the necessary `<uses-permission>` statement.

```xml
<uses-permission android:name="android.permission.READ_MEDIA_IMAGES"/>
```

The third possible cause may be due to your device's API level. According to the [Official Documentation](https://developer.android.com/reference/android/Manifest.permission#READ_MEDIA_IMAGES), it states that:

> Allows an application to read image files from external storage.
> This permission is enforced starting in API level `Build.VERSION_CODES.TIRAMISU`. An app which targets `Build.VERSION_CODES.TIRAMISU` or higher and needs to read image files from external storage must hold this permission; `READ_EXTERNAL_STORAGE` is not required. For apps with a targetSdkVersion of `Build.VERSION_CODES.S_V2` or lower, the `READ_EXTERNAL_STORAGE` permission is required, instead, to read image files.

`Build.VERSION_CODES.S_V2` refers to 32 while `Build.VERSION_CODES.TIRAMISU` refers to 33. For more details, refer to [Build.VERSION_CODES](https://developer.android.com/reference/android/os/Build.VERSION_CODES). So, in short, if your API level is 32 and below, you will require two permissions, the first being `Manifest.permission.READ_MEDIA_IMAGES` and the second `Manifest.permission.READ_EXTERNAL_STORAGE`.

Hence, you have to include the following statement in your `AndroidManifest.xml`:

```xml
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.READ_MEDIA_IMAGES"/>
```

and modify your `MainActivity.java` as follows:

```java
if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
    if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
            != PackageManager.PERMISSION_GRANTED &&
            checkSelfPermission(Manifest.permission.READ_MEDIA_IMAGES)) {
        requestPermissions(new String[] { 
            Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.READ_MEDIA_IMAGES },
                MY_PERMISSIONS_REQUEST_READ_MEDIA_IMAGES);
        // MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE is the app-defined int constant
        return ;
    }
}
```

Then your app should be able to request the permission correctly.

Here's the corrected text with grammatical errors addressed and clarification added:

### 2 - Photo Displaying Issue

If you are copying the code from `Practical8.pdf` as follows:

```java
List<Image> ImageList = getPhotos();
ImageView IVThumb1 = findViewById(R.id.IVThumb1);
ImageView IVThumb2 = findViewById(R.id.IVThumb2);
ImageView IVThumb3 = findViewById(R.id.IVThumb3);

if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
    try {
        Bitmap thumbnail1 = getApplicationContext().getContentResolver().loadThumbnail(
                ImageList.get(0).uri, new Size(640, 480), null);
        IVThumb1.setImageBitmap(thumbnail1);
        // ...
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```

You might encounter an app crash and the following error message:

```bash
FATAL EXCEPTION: main

Process: com.example.wia2007_mad, PID: 15866

java.lang.RuntimeException: Unable to start activity ComponentInfo{com.example.wia2007_mad/com.example.wia2007_mad.GalleryActivity}: java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
...
```

This occurs because the code snippet provided assumes the photos in the OS are never empty, which isn't always true. Instead, the album, or `photos` in your OS, can be empty. In such cases, `ImageList` indeed has a `.size()` of 0, or `.isEmpty()` returns true. Hence, trying to use `.get()` will throw an error.

To resolve this issue, modify your `activity_gallery.xml` to add a line of message indicating that there are no images in the album. Add the following code to your `.xml` file:

```xml
<TextView
    android:id="@+id/TVNoImages"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="No images to show"
    android:textSize="20sp"
    android:layout_marginTop="20dp"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toBottomOf="@id/TVGalleryTitle"/>
```

Remember to adjust the constraints accordingly. Then, make the necessary modification in `GalleryActivity.java`:

```java
if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
    if(!imageList.isEmpty()) {
        findViewById(R.id.TVNoImages).setVisibility(View.GONE);
        try {
            Bitmap thumbnail1 = getApplicationContext().getContentResolver().loadThumbnail(
                    imageList.get(0).uri, new Size(640, 480), null);
            IVThumb1.setImageBitmap(thumbnail1);
            // ...
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

As you can see, `if(!imageList.isEmpty())` and `findViewById(R.id.TVNoImages).setVisibility(View.GONE)` are used to handle such cases.

If you wish for the gallery to run smoothly and display the correct images, then use the camera function and take some photos. It should work as intended.

### 3 - Syntax Explanation

#### 3.1 - `loadThumbnail`

```java
if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
    if(!imageList.isEmpty()) {
        findViewById(R.id.TVNoImages).setVisibility(View.GONE);
        try {
            Bitmap thumbnail1 = getApplicationContext().getContentResolver().loadThumbnail(
                    imageList.get(0).uri, new Size(640, 480), null);
            IVThumb1.setImageBitmap(thumbnail1);
            // ...
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

- `android.os.Build.SDK_INT` can be used to get the current SDK version.
- `android.os.Build.VERSION_CODES.Q` refers to API level 29. The reason of setting such conditions is because `ContentResolver.loadThumbnail()` is introduced in API level 29. Hence, for the earlier version, `loadThumbnail()` cannot be used.
- `Bitmap` is just a map of bits.

### 3.2 - SharedPreferences

```java
SharedPreferences pref = getPreferences(Context.MODE_PRIVATE);
String SPBgColorCode = pref.getString("BgColorCode", "");
int SPImageNumber = pref.getInt("ImageNumber", 3);
```

```java
SharedPreferences pref = getPreferences(Context.MODE_PRIVATE);
SharedPreferences.Editor editor = pref.edit();
String BgColorCode = ETBgColorCode.getText().toString();
int ImageNumber = Integer.parseInt(ETImageNumber.getText().toString());
editor.putString("BgColorCode", BgColorCode);
editor.putInt("ImageNumber", ImageNumber);

editor.apply();
```

The code is both straightforward and intuitive. Initially, it prompts the creation of SharedPreferences to retrieve data. Then, it utilizes SharedPreferences.Editor to write the data. That's all.
