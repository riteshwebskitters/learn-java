# J-7 — S-9: String Validation and Normalization

This is particularly useful in backend development because APIs receive user input that may be empty, contain extra spaces, or have inconsistent casing.

1. Important methods
Method	Purpose

isEmpty()	Checks whether length is zero
isBlank()	Checks whether String is empty or contains only whitespace
trim()	Removes leading/trailing basic whitespace
strip()	Removes leading/trailing Unicode whitespace
equalsIgnoreCase()	Compares without considering letter casing


# J-8 — Java Arrays
Arrays are essential for backend development because you'll frequently work with collections of data: transactions, users, account balances, payment records, and more.

We'll learn arrays before moving into Java Collections (ArrayList, HashMap, etc.).
S-1: Understanding Arrays
An array allows you to store multiple values of the same data type in a single variable.

Without an array:
int transaction1 = 1500;
int transaction2 = 2500;
int transaction3 = 3500;
int transaction4 = 4500;


With an array:
int[] transactions = {1500, 2500, 3500, 4500};


One variable now holds four transaction amounts.
1. Accessing array elements
Java arrays use indexes, starting from zero.
int[] transactions = {1500, 2500, 3500, 4500};

System.out.println(transactions[0]); // 1500
System.out.println(transactions[1]); // 2500
System.out.println(transactions[2]); // 3500
System.out.println(transactions[3]); // 4500


Array index visualization
1500
Index 0

2500
Index 1

3500
Index 2

4500
Index 3



2. Array length
Unlike Strings, arrays use .length, not .length().
int[] transactions = {1500, 2500, 3500, 4500};

System.out.println(transactions.length); // 4


Remember:
Type	Length
String	value.length()
Array	value.length

3. Creating arrays with a fixed size
You don't always have values immediately.
int[] transactions = new int[5];


This creates an integer array with five slots.

Java initializes the slots with default values:
[0, 0, 0, 0, 0]


Other common defaults:
Data type	Default
int	0
double	0.0
boolean	false
char	'\u0000'
Reference types	null

Array size is fixed after creation.