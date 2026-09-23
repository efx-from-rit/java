package freshman.java;
// The purpose of this file is for my own personal basic review of Java principles
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
    }
} // closing bracket of Basics class
/* Syntax:
Name of the java file must match the class name
EX:
    Class name: Basics
    File name: Basics.java
    */