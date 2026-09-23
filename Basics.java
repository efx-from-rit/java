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
       String - stores text, surrounded by double quotes
       int - stores integers (whole numbers, (+) or (-))
       float - stores floating point numbers, with decimals (EX: 19.99)
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
    }
} // closing bracket of Basics class