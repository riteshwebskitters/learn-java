# Syntax Concept
These are fundamental concepts, and I don't want you to just memorise the main() syntax.

We'll break it down from the outside in.

### 1. Why do we write public class UserInput first?
Consider this structure:
public class UserInput {

    public static void main(String[] args) {

    }

}


Think of a class as a container or blueprint that holds related code.

In Java, methods generally belong to classes (or other types, such as interfaces and records).

For example:
public class UserInput {

    public static void main(String[] args) {
        System.out.println("Hello Java");
    }

    public static void greet() {
        System.out.println("Welcome!");
    }
}


Here:
- UserInput is the class.
- main() is a method.
- greet() is another method.
- Both methods belong to the UserInput class.
Java is designed around classes and objects. Unlike JavaScript, where you can write standalone functions at the top level of a file, ordinary Java methods must belong to a type.

Why does the class come first?

Because we're declaring the type that contains the methods. The methods are defined inside its body.

Think of it like:
UserInput — Class
main() — Method

Application entry point

greet() — Method

Another operation



### 2. What is the role of String[] args?
This is probably the most interesting part.

Let's separate it:
public static void main(String[] args)


Part	Meaning
String	Data type
[]	Array notation
args	Variable name

Together:
String[] args


Means:

A variable named args that can hold an array of Strings.

An array is a collection of values of the same type. We'll study arrays in J-6/J-7.

For example, imagine:
String[] args = {"Ritesh", "28", "Developer"};


Now args contains three String values:
Index	Value
0	Ritesh
1	28
2	Developer

You can access them like this:
System.out.println(args[0]); // Ritesh
System.out.println(args[1]); // 28
System.out.println(args[2]); // Developer


Notice that even "28" is a String here, not an integer.
### 3. Where do these arguments come from?
When you execute a Java application, you can supply arguments through the terminal.

For example:
java UserInput Ritesh 28 Developer


Java passes these values into:
public static void main(String[] args)


So internally, you can think of it as receiving:
args[0] = "Ritesh";
args[1] = "28";
args[2] = "Developer";


You could then write:
public class UserInput {
    public static void main(String[] args) {
        System.out.println("Name: " + args[0]);
        System.out.println("Age: " + args[1]);
        System.out.println("Profession: " + args[2]);
    }
}


This example assumes all three arguments are provided. Accessing a missing index causes an ArrayIndexOutOfBoundsException.
### 4. Why String[] args? Why not int, double, or just ()?
Excellent question.

The standard Java launcher has a defined entry-point method signature. In our course, we use:
public static void main(String[] args)


The launcher supplies command-line arguments as Strings.

It does not automatically supply arbitrary integers or doubles.

If you wanted an integer, you could convert one of the String arguments:
int age = Integer.parseInt(args[1]);


If you wanted a decimal:
double salary = Double.parseDouble(args[2]);


The distinction is:
- String[] args receives the command-line input.
- Conversion methods turn those String values into numeric types when required.
Can we use just ()?
Consider:
public static void main() {
    System.out.println("Hello");
}


This is a valid Java method declaration.

However, it is not the standard entry point recognised by the Java launcher.

So:
Method declaration	Valid method?	Standard launcher entry point?
main(String[] args)	Yes	Yes
main()	Yes	No
main(int age)	Yes	No
main(double score)	Yes	No
main(int age, String name)	Yes	No

The important distinction is that Java permits us to create many methods named main, but the launcher looks for its recognised entry-point signature.

### 5. What happens when Java runs your program?
Let's put everything together.
Step 1
You execute the command
java UserInput Ritesh 28




Step 2 — Java launcher

Finds the UserInput class and its recognised main method.


Step 3 — main() starts

Receives String[] args containing the command-line arguments.


Step 4 — Your code executes

You can read arguments, call other methods, create objects, and perform operations.