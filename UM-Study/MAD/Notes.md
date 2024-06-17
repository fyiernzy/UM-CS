# Notes

## 1. `DrawerLayout` and nested layout

`DrawerLayout` will automatically set the width and height of the first widget to `match_parent`. If you uses only `FragmentContainerView`, go ahead. If your wish to use `Toolbar`, `FCV` and other widgets together, use a nested layout within the `Drawer Layout` for the proper positioning.

## 2. The ordering of widgets

In Android XML layouts, the ordering of widgets in the file typically affects their stacking order on the screen, especially in layouts like FrameLayout or DrawerLayout. The first widget in the XML is placed at the bottom of the stacking order, and subsequent widgets are stacked on top of it. This means the last widget in the XML file appears on top in the stacking order.

## 3. ViewModel

`ViewModel` in Android development serves two main purposes: it stores UI-related data and aids in managing communication between fragments.

Before `ViewModel` was introduced, `savedInstanceState` was commonly used for preserving small amounts of UI data across configuration changes. However, `savedInstanceState` has limitations in data capacity and complexity, making it less effective for larger or more complex data sets. ViewModel effectively addresses these limitations by providing a way to hold and manage UI-related data that is lifecycle-aware. It ensures that the data survives configuration changes such as screen rotations.

Consider fragments as students needing to access shared study materials. Before `ViewModel`, this was like students passing notes directly to each other—a limited and less efficient method. With `ViewModel`, it's like having a shared locker (or Google Drive), where students can access and exchange materials more efficiently and persistently.

## 4. Callback

Callback generally refers to the mechanism that allows an application to respond to the changes in events or states. For example, [RoomDatabase.Callback](https://developer.android.com/reference/androidx/room/RoomDatabase.Callback) consists of three methods, namely `onCreate`, `onDestructiveMigration` and `onOpen`, which are the methods that respond to the changes.

## 5. The mechanism of Room library

When using annotations like `@Entity`, `@Dao`, and `@Database` in Room, a part of Android's architecture components, we essentially define the high-level architecture rather than the implementation details. The `@Entity` annotation is used to mark a class as an entity in a database, `@Dao` is an interface for defining database operations, and `@Database` is an abstract class for database configuration.

1. **`@Entity`**: This annotation marks a class as a table in the database. It's not necessarily an interface but a regular class with properties representing the columns of the table.

2. **`@Dao`**: This is an interface where we define methods to access the database. Methods in this interface are annotated with Room-specific annotations like `@Query`, `@Insert`, etc., to perform various database operations.

3. **`@Database`**: This is an abstract class where the database is defined. It includes abstract methods to get DAO instances.

The Room Compiler plays a crucial role in this architecture. It processes these annotations and generates concrete implementation classes at compile time. For `@Dao` interfaces, Room creates implementations that handle the database operations defined in the interface. For the abstract class annotated with `@Database`, Room generates a subclass with concrete implementations of the abstract methods, including those returning DAO instances.

Therefore, when we use `Room.databaseBuilder()`, it actually generates an instance of the Room-generated subclass of the `@Database` annotated abstract class. This is why we can invoke methods like `noteDao()` on our database instance, despite them being abstract in our definition - Room has provided the concrete implementation under the hood.

Certainly! Here's your content revised based on the critique for clarity, accuracy, and grammar:

## 6. Mechanism of RoomDatabase, ViewModel, and Repository

- **RoomDatabase** primarily consists of three components: the `Dao` (Data Access Object) for defining database interactions, a `getDatabase` method for instance creation, and access to the `ExecutorService` for asynchronous operations.
- The `Dao` delegates the task of performing CRUD (Create, Read, Update, Delete) operations on the database.
- **ExecutorService** can be used as follows for asynchronous tasks:

  ```java
  ExecutorService executorService = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
  executorService.execute(() -> {
      // Database operations
  });
  ```

- **Repository** acts as an intermediary between the database and the application, managing data transactions and providing a clean API for data access. It utilizes `ExecutorService` and `Dao` to perform CRUD functions.
- **ViewModel** stores and manages UI-related data, surviving configuration changes. It accesses the `Repository` to perform data operations, maintaining a separation of concerns.

## 7. Using DrawerLayout and Toolbar

- To integrate a `DrawerLayout` and `Toolbar`, set the application theme to `NoActionBar`. Then, use `setSupportActionBar()` with the defined `Toolbar` in the XML layout.
- To configure `DrawerLayout` with `Toolbar`, use the following code:

  ```java
  ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, 
      binding.drawerLayout, 
      binding.toolbar, 
      R.string.navigation_drawer_open, 
      R.string.navigation_drawer_closed);
  binding.drawerLayout.addDrawerListener(toggle);
  toggle.syncState();
  ```

### 8. Using Bottom Navigation Bar with Nav Graph

- `NavHostFragment` serves as a container for navigation destinations. Define it in your XML layout with the following properties:

  ```xml
  <androidx.fragment.app.FragmentContainerView
      android:id="@+id/my_nav_host_fragment"
      android:name="androidx.navigation.fragment.NavHostFragment"
      app:navGraph="@navigation/nav_sample"
      app:defaultNavHost="true" />
  ```

- In your Activity or Fragment, retrieve the `NavController`:

  ```java
  NavHostFragment host = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.my_nav_host_fragment);
  NavController navController = host.getNavController();
  ```

- Use `AppBarConfiguration` in conjunction with `NavController` to manage ActionBar behavior:

  ```java
  AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
  NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
  ```

- `AppBarConfiguration` defines top-level destinations and controls the ActionBar's display of the 'Up' icon or hamburger icon.
- To set up Bottom Navigation or Side Menu, use:

  ```java
  private void setupNavMenu(NavController navController){
      NavigationView sideNav = findViewById(R.id.sideNav);
      NavigationUI.setupWithNavController(sideNav, navController);
  }

  private void setupBottomNavMenu(NavController navController) {
      BottomNavigationView bottomNav = findViewById(R.id.bottom_nav_view);
      NavigationUI.setupWithNavController(bottomNav, navController);
  }
  ```

### 9. Using ViewModel

- Initialize `ViewModel` in Activities and Fragments as follows:

  ```java
  ViewModel model = new ViewModelProvider(this).get(ViewModel.class);
  ```

  Use `this` in Activities and `requireActivity()` in Fragments.

### 10. About Observable and Observer

- In the code snippet `mNoteViewModel.getAllNotes().observe(getViewLifecycleOwner(), adapter::submitList);`, `LiveData` from `ViewModel` acts as the observable. It notifies the observer, here the `ListAdapter`, whenever there's a change in the data set.

### 11. NavController and NavigationView

- `NavController` manages navigation based on the IDs in both the `NavGraph` and `NavigationView`. For seamless navigation, ensure that IDs in the `NavGraph` match those in the `NavigationView` menu.
