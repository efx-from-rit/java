package freshman.java;
// The purpose of this file is for my own personal basic review of Java principles
/* Syntax:
Name of the java file must match the class name
EX:
    Class name: Basics
    File name: Basics.java
    */

public class Basics{ // opening bracket of Basic class; universal convention to start class name with capital letter
    public static void main(String[] args){ // What the JVM [Java Virtual Machine] looks for to begin running code
        System.out.println("Hello World!"); // Prints "Hello World!" to the temrinal/console
        /* 
        println() = print line
        "ln" = prints a new line for each individual println statement
        System = built-in java class
        out = member of System, short for "output" 
        ; = marks the end of a java statement (absolutely necessary)
        Example below:
        */
        System.out.println("Hello Evan!");
        System.out.println("Hello John!");
        System.out.println("WE all love Java!");
        /*
        Text must go inside double quotes ("")
        print() method => no new line at the end of output
        Example below
            */
        System.out.print("No new line after this!");
        System.out.print("I printed on the same line." + "\n");
        /*
        Can output numbers with the println() method
        Can perform mathematical calculations in the println() method
        Example below:
        */
        System.out.println("Number 67: " + 67);
        System.out.println("1 + 1 = " + (1+1));
        // Single Line Comment Example

        /*
        Multi-line Comment Example
        */

        /*
        Types of Variables:
        String - stores text (sequence of characters), surrounded by double quotes
        int - stores integers (whole numbers, (+) or (-))
        float - stores floating point numbers, with decimals (EX: 19.99), goes to 6-7 decimal digits
        double - stores decimal numbers, goes to 16 digits
        char - stores single characters, surrounded by single quotes
        boolean - stores values with two states: true and false

        Example of Initialization and Declaration:
        */

        String name = "Quandale Dingle";
        int num = 0;
        double dec = 3.14;
        char letter = 'A';
        boolean val = true;

        System.out.println(name + " " + num + " " + dec + " " + letter + " " + val);
        /* 
        (+) = Concatenation Symbol
        Adds together numbers (integer, double, float)
        Joins together Strings
        */

        int x = 5, y = 6, z = 7;
        System.out.println(x + y + z);
        /*
        Shorter than three individual lines for each variable, comma-separated list
        */

        /*
            Rules for naming variableS:
            Names can contain letters, digits, underscores, and dollar signs
            Names must begin with a letter
            Names should start with a lowercase letter, and cannot contain whitespace (camelCase)
            Names can also begin with $ and _
            Names are case-sensitive ("myVar" and "myvar" are different variables)
            Reserved words (like Java keywords, such as int or boolean) cannot be used as names
        */

            // Constant Example (use "final" keyword when the variable value should NEVER change):
            final int BIRTH_YEAR = 1990;
            System.out.println(BIRTH_YEAR);

            // Examples using previous notes:
            int length = 9;
            int width = 7;
            int recArea = length * width;
            System.out.println("Rectangle Area: " + recArea);

            /*
            Primitive Data Types:
            Byte, short, int, long, float, double, boolean, char
            Usually start with a lowercase letter
            Can be null

            Non-Primitive:
            String, Arrays, Classes
            Usually start with an uppercase letter
            Always hold a value
            */

            /*
            "var" keyword => Java compiler automatically detects the type of variable based on the value you assign to it
            Only works when you assign a value at the same time
            Use when dealing with more complex variable types (ArrayLists, HashMap, etc.)
            Example below:
            */
            var number = 5;
            var text = "Text";
            System.out.println(text + " " + number);

        /*
        Casting:
        Two Types:

        Widening Casting (automatic) - converting smaller type to larger type size
        No risk of losing information
        EX: byte => short => char => int => long => float => double

        Narrowing Casting (manual) - converting larger type to smaller type
        must be done manually by placing the type in parentheses in front of the value
        May result in data loss without proper parenthesis
        EX: double => float => long => int => char => short => byte

        Examples Below:
        */
            int myInt = 9;
            double myDouble = myInt; // myInt is now 9.0

            System.out.println(myInt);    // Outputs 9
            System.out.println(myDouble); // Outputs 9.0

    }
} // closing bracket of Basics class