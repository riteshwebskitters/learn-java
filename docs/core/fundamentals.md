# FUNDAMENTALS OF JAVA.

## UNDERSTAND BETWEEN JVM vs JRE vs JDK

JVM — Java Virtual Machine

The runtime engine that executes Java bytecode. It manages memory, garbage collection and execution.

JRE — Java Runtime Environment

Traditionally, the runtime package containing the JVM and supporting libraries needed to run Java applications.

JDK — Java Development Kit

The development toolkit. It includes the compiler (javac), Java runtime components and development tools.


The rule: A public top-level class must have the same name as its source file, including uppercase and lowercase letters.

This is a compile-time rule, not a runtime rule.


# Type Convserion
Java does not allow implicit narrowing conversion from double to int because fractional information could be lost.
double price = 99.99;
int finalPrice = (int) price;

Here type casting happens --> (targetType) value




export ADMIN_TOKEN="<paste-admin_auth_token-here>"
