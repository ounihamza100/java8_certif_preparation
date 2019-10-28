package java_building_blocks;


import java.sql.Date;
import java.util.*;

//. Import statements tell Java which packages to look in for classes. Since you didn’t tell Java where to look for Class, it has no clue ( ).

//. The import statement tells the compiler which package to look in to fi nd a class.

//Package names are hierarchical   If it begins with java or javax, this means it came with the JDK


// wildcard * matches all classes in the packages, it doesn't import child packages ,fields or methods it imports only classes.

// Listening the classes used makes the code easier to read.using the wildcard  can shorten the import list.

// There is special package in the java world  automatically imported  java.lang

//  we can put import java.lang.*  but we don't have to. we can have only one wildcard and must be at the end

//One of the reasons for using packages is so that class names don’t have to be unique across all of Java.

// if you import a classname it takes precedence over any wildcards present.

/**
 * If you do have a public class, it needs to match the filename
 *
 * @author Hamza Ouni
 */
// class Animal {
//
//}

//public class Animal2 would not compile in a file named Animal.java.
// the key word public :  we called it access modifier , It declares this method’s level of exposure
//to potential callers in the program.
/*public*/

public class Animal {

    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);


        Date x;
        String a = "";
    }

}

