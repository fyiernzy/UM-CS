# Appendix

## Generate `.txt` and `.dat` file

> If you use `.writeUTF()` to write `.dat` file, the you should use `.readUTF()` to read the String. Else, you'll get `EOFException`. It's also true if you use `.writeObject()`, then you should use `(String) .readObject()` to read the String.

</br>

```java
public static void generateTextFile(String file) {
    try {
        PrintWriter writer = new PrintWriter(file);
        
        writer.println(4);
        writer.println("Ali/19/M");
        writer.println("Siti/16/F");
        writer.println("Muttu/19/M");
        writer.println("Mei Mei/20/F");
        
        writer.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public static void generateBinaryFile(String textFile, String binaryFile) {
    try {
        BufferedReader reader = new BufferedReader(new FileReader(textFile));
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(binaryFile));
        
        int n = Integer.parseInt(reader.readLine());
        String line = "";
        
        output.writeInt(n);
        
        for(int i = 0; i < n; i++) {
            if((line = reader.readLine()) != null) {
                String[] info = line.split("/");
                output.writeObject(info[0]);
                output.writeInt(Integer.parseInt(info[1]));
                output.writeChar((int) info[2].charAt(0));
            }
        }
        
        reader.close();
        output.close();
        
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
```

</br>

## Method 1 - Using Matrix

Credit to <https://gitlab.com/fop2022/group05/-/blob/main/22004835/lab%207/L7Q5.java>

```java
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class L7Q5 {
    public static void main(String[] args) {
        String[][] person = getPersonMatrix("../WIX1002/io_files/person.dat");
        
        sortMatrixByName(person);
        
        for(int i = 0; i < person.length; i++)
            System.out.printf("%-15s %-3s %s \n", person[i][0], person[i][1], person[i][2]);

    }

    public static String[][] getPersonMatrix(String fromFile) {
        String[][] person = null;
        
        try (ObjectInputStream output = new ObjectInputStream(new FileInputStream(fromFile))) {

            int num = output.readInt();
            person = new String[num][3];

            for(int i = 0; i < num; i++){
                person[i][0] = (String) output.readObject();
                person[i][1] = Integer.toString(output.readInt());
                person[i][2] = Character.toString(output.readChar());
            }
            
        }
        catch (Exception ex) { }
        
        return person;
    }

    public static void sortMatrixByName(String[][] person) {
        // Bubble Sort
        for(int i = 0; i < person.length; i++) {
            for(int j = 0; j < person.length - 1 - i; j++) {
                if(person[j][0].compareTo(person[j + 1][0]) > 0) {
                    String[] tmp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = tmp;
                }
            }
        }
    }
}
```

</br>

## Method 2 - Using ArrayList with Class

### Main class

```java
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class L7Q5S3 {
    public static void main(String[] args) {
        String textFile = "../WIX1002/io_files/person.txt";
        String binFile = "../WIX1002/io_files/person.dat";
        
        ArrayList<Person> ls = getNameList(binFile);
        Collections.sort(ls);
        showNameList(ls);
    }

    public static ArrayList<Person> getNameList(String fromFile) {
        ArrayList<Person> ls = new ArrayList<Person>();
        
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fromFile))) {
            int n = input.readInt();
            
            for(int i = 0; i < n; i++) 
                ls.add(new Person((String) input.readObject(), input.readInt(), input.readChar()));

        } catch (Exception ex) { ex.printStackTrace(); }
        
        return ls;
    }

    public static void showNameList(ArrayList<Person> ls) {
        for(Person person : ls) {
            System.out.printf("Name:  %-8s | Age: %3d | Gender: %s\n",
                    person.getName(), person.getAge(), person.getGender());
        }
    }
}
```

### Person class

```java
class Person implements Comparable<Person> {
    private String name;
    private int age;
    private char gender;

    Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public int compareTo(Person another) {
        return this.getName().compareTo(another.getName());
    }

    public String getName() {
        return this.name;
    }

    public char getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }
}
```

</br>

## Method 3 - Using Multiple Array

Modified from: <https://gitlab.com/fop2022/group05/-/blob/main/22004835/lab%207/L7Q5.java>


```java
public class L7Q5 {

    public static void main(String[] args) {
        String[] nameArr = null;
        int[] ageArr = null;
        char[] genderArr = null;
        int[] indexArr = null;
        
        int num = 0;
        
        
        try {
            ObjectInputStream output = new ObjectInputStream(new FileInputStream("../WIX1002/io_files/person.dat"));
            num = output.readInt();
            
            nameArr = new String[num];
            ageArr = new int[num];
            genderArr = new char[num];
            indexArr = new int[num];
            
            
            for(int i = 0; i < num; i++) {
                indexArr[i] = i;
                nameArr[i] = (String) output.readObject();
                ageArr[i] = output.readInt();
                genderArr[i] = output.readChar();
            }

            output.close();
            
        } catch (Exception ex) { ex.printStackTrace(); }
        
        sort(indexArr, nameArr);
        
        for(int i : indexArr) {
            System.out.printf("%-20s %-3d %s \n", nameArr[i], ageArr[i], genderArr[i]);
        }
        
    }
    
    public static void sort(int[] indexArr, String[] nameArr) {
        for(int i = 0; i < indexArr.length; i++) {
            for(int j = 0 ; j < indexArr.length - i - 1; j++){
                if(nameArr[indexArr[i]].compareTo(nameArr[indexArr[i+1]]) > 0) {
                    int temp = indexArr[i];
                    indexArr[i] = indexArr[i+1];
                    indexArr[i+1] = temp;
                }
            }
        }
    }
}
```

## Method 4 - Using Multiple HashMap with Arrays

Modified from: <https://github.com/LimJY03/WIX1002_UM/blob/main/Lab%2007/L7Q5.java>


```java
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class L7Q5 {

    public static void main(String[] args) {
        try {
            int recordCount = 0;
            ObjectInputStream file = new ObjectInputStream(new FileInputStream("./io_files/person.dat"));
            LinkedHashMap<String, Integer> data_1 = new LinkedHashMap<>();
            LinkedHashMap<String, Character> data_2 = new LinkedHashMap<>();

            recordCount = file.readInt();

            String[] names = new String[recordCount];

            for (int i = 0; i < recordCount; i++) {

                names[i] = file.readUTF();

                data_1.put(names[i], file.readInt());
                data_2.put(names[i], file.readChar());
            }

            Arrays.sort(names); // Sorting

            for (String name: names) {
                System.out.printf("Name: %-12s, Age: %-2d, Gender: %1s\n", name, data_1.get(name), data_2.get(name));
            }

            file.close();

        } catch (FileNotFoundException e) { 
            System.out.println("File Not Found"); 
        } catch (IOException e) { 
            System.out.printf("IO Exception: %s\n", e); 
        }
    }
}
```