Stack vs Heap Memory
Previous concepts completed
 Current lesson


Before we start, let's connect what you've already learned:
- Primitive assignment copies the value.
- Reference assignment copies the reference.
- Object mutation changes the shared object.
- Reference reassignment changes where a variable refers.
- new creates an object.
Now the important question:

Where does Java actually store these variables and objects while your program is running?
1. Understanding Stack vs Heap
The JVM uses different memory areas for different purposes. Two important ones for our current learning are:
Stack memory
Method execution
- Stores method frames.
- Each method call gets its own frame.
- Local primitive variables and local reference variables are represented in method frames.
- Method frames are removed when their calls finish.

Heap memory
Object storage
- Stores objects and arrays.
- Objects created using new are allocated on the heap.
- Objects can be referenced by multiple variables.
- Garbage collection manages objects that are no longer reachable.

2. Let's understand with actual Java code
Consider this:
public class MemoryExample {

    public static void main(String[] args) {

        int age = 28;

        Student student1 = new Student();

        student1.name = "Ritesh";

    }
}

class Student {
    String name;
}


Let's break this down.

Step 1: Primitive variable
int age = 28;


The local variable age is stored in the main() method's stack frame.

Step 2: Object creation
Student student1 = new Student();


Two things happen conceptually:
1. A Student object is created on the heap.
2. The local variable student1 holds a reference to that object in the main() stack frame.
Step 3: Assigning object property
student1.name = "Ritesh";


We access the heap object through student1 and assign its name field.
3. Visual understanding
JVM memory (simplified)
STACK

main() frame
age

28

student1

Reference →



HEAP

Student object
Student

name

"Ritesh"




Conceptual representation, not a literal JVM memory layout.

The most important thing to understand:

student1 is not the actual Student object. It holds a reference that allows Java to access the object.