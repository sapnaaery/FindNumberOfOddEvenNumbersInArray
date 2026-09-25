Find Number of Odd and Even Numbers in an Array
📌 Description
This Java program counts how many even and odd numbers are present in an integer array.

The program iterates through each element of the array and uses the modulo (%) operator to determine whether the number is even or odd.

🛠️ Technologies Used
Java

Arrays

for loop

if-else statement

Modulo (%) operator

📂 Package
package day7;

💻 How It Works
An integer array is initialized with several numbers.

Two counters are created:

evenCounter — keeps track of even numbers.

oddCounter — keeps track of odd numbers.

A for loop goes through every element in the array.

The program checks:

i[x] % 2 == 0

If the remainder is 0, the number is even and evenCounter is increased.

Otherwise, the number is odd and oddCounter is increased.

Finally, the program prints the total number of even and odd numbers.

🔢 Sample Input
int i[] = {10, 8, 31, 80, 9, 37, 56, 42, 55};

📤 Expected Output
Number of Even numbers is: 5
Number of odd numbers is: 4

🎯 Learning Objective
This program demonstrates how to:

Traverse an array using a for loop.

Identify even and odd numbers.

Use counters to keep track of results.

Use the modulo operator in Java.

🚀 How to Run
Open the project in a Java IDE such as Eclipse, IntelliJ IDEA, or VS Code.

Place the class inside the day7 package.

Run the main() method.

View the result in the console.

📄 Class Name
FindNumberofOddAndEvenNumbersInArray
