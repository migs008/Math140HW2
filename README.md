# Math140HW2
Math 140 Programming Assignment 2 Deadline: Feb 27, 2019, 11:59 pm
Assignment: Write a Java class called AssignmentTwo that contains the five static
methods defined below. Some of the methods are similar to worksheet problems
covered in class.
Learning Outcome: Review how to work with two-dimensional arrays, threedimensional
arrays, and the System.arraycopy method.
I will eventually post a main method to test your code. However, develop your own
tests to make sure your methods generate the correct output.
Review the coding instructions at the end of this document.
1. public static int numElements(int[][] twoDim)
a. if twoDim is null then return -1
b. otherwise, return the number of integers stored in twoDim.
c. twoDim may contain null rows
d. if all rows of twoDim are null then return 0.
e. do not use a nested loop to compute the number of elements; instead,
use the length property of each non-null row
Example:
twoDim = {null, {9, 0, 8}, null, {0, 7, 6, 3, 4}};
The method returns 8 since there are eight integers in the array.
Math 140 Programming Assignment 2 Deadline: Feb 27, 2019, 11:59 pm
2. public static int numElements(int[][][] threeDim)
a. if threeDim is null then return -1.
b. otherwise, return the number of integers stored in threeDim.
c. threeDim may contain two-dimensional arrays that are set to null.
d. if every two-dimensional array stored in threeDim is null then return 0.
e. do not use a nested loop to compute the number of elements; instead,
call the numElements method described in part 1.
Example:
threeDim = {
{{null, {9, 0, 8}, null, {0, 7, 6, 3, 4}} ,
{{9, 1, 50}, {99, 11}, {6}} ,
null,
{{8, 9, 45, 8, 0}, {6, 7, 2}, {4, 8}}
}
The method returns 24 since there are 24 integers in the array.
3. public static int[] twoDimensionalToOneDimensional(int[][] arr)
• if arr is null then return null
• otherwise (i) copy the non-null rows of arr to a one-dimensional array and (ii)
return the one-dimensional array.
• arr can contain null rows
• the length of the returned array should be equal to the number of integers
stored in the non-null rows of arr; hint: use the result from method 1 to find
the length of this array.
• copy the non-null rows in ascending order. In other words, first copy row 0 to
the one-dimensional array, then row 1, 2, etc.
• if all the rows contained in arr are null then return an array whose length is
zero.
• use the System.arraycopy method to copy the non-null rows of arr to the
one-dimensional array
Example:
Assume arr = {{1, 20, 50}, {5, 8}, null, {22, 100, 200, 1}};
The method returns the following one-dimensional array:
{1, 20, 50, 5, 8, 22, 100, 200, 1};
Math 140 Programming Assignment 2 Deadline: Feb 27, 2019, 11:59 pm
4. public static int[] threeDimensionalToOneDimensional(int[][][] arr)
• if arr is null then return null
• otherwise (i) copy the non-null two-dimensional arrays in arr to a onedimensional
array and (ii) return the one-dimensional array.
• arr may contain two-dimensional arrays that are set to null.
• the length of the returned array should be equal to the number of integers
stored in the non-null two-dimensional arrays.
• copy the non-null two-dimensional arrays in ascending order. In other words,
first copy array 0 to the one-dimensional array, then array 1, 2, etc.
• if all two-dimensional arrays contained in arr are null then return an array
whose length is zero.
• for every non-null array stored in arr, use the System.arraycopy method to
copy the result from twoDimensionalToOneDimensional into the onedimensional
array
Example:
Assume arr = {
{{null, {9, 0, 8}, null, {0, 7, 6, 3, 4}},
{{9, 1, 50}, {99, 11}, {6}},
null,
{{8, 9, 45, 8, 0}, {6, 7, 2}, {4, 8}}
}
The method returns the following one-dimensional array:
{9, 0, 8, 0, 7, 6, 3, 4, 9, 1, 50, 99, 11, 6, 8, 9, 45, 8, 0, 6, 7, 2, 4, 8};
Math 140 Programming Assignment 2 Deadline: Feb 27, 2019, 11:59 pm
5. public static int[] removeLargest(int[] arr)
• if arr is null then return null; if arr is non-null then assume that arr contains
at least one int value
• otherwise, return an array that contains all the values stored in arr except for
the largest value; if the largest value appears more than one time, then
remove the first occurrence; the length of the returned array is arr.length –
1.
• Use the System.arraycopy method to copy values of arr into the returned
array; if index is the location of the deleted value then copy values stored in
indices 0 through index -1 and index + 1 through arr.length – 1 to the
returned array
Example: Suppose arr = {9, -2, 3, 50, 4, 99, 11, 4, 5, 99, 3, 4, -6};
The method returns the following array {9, -2, 3, 50, 4, 11, 4, 5, 99, 3, 4, -6};
Math 140 Programming Assignment 2 Deadline: Feb 27, 2019, 11:59 pm
Coding Instructions
1. Do not use any Java classes that trivialize the problem.
2. Do not declare static instance variables for this assignment.
3. You can write additional helper methods.
4. Test each of the methods.
5. Use consistent notation to format your code. Indent 4-spaces.
6. Variables and methods should start with a lower-case character. Each
abbreviation or word that appears in the middle of the identifier starts with an
uppercase character.
7. Use meaningful variables names.
8. Do not use variable names that consist of one character unless they are declared
in a for loop. Example: for (int i = 0; i < arr.length; i++)
9. Do not use a single character for an abbreviation. Example: Suppose a variable
represents the number of books. Do not call this variable nBooks. Instead, use
numBooks or numberBooks.
10. Do not use break statements in while or for loops.
11. Do not use nested loops in this assignment.
12. Do not change the value of a counter variable to terminate a loop:
Example:
for (int i = 0; i < arr.length; i++){
if (arr[i] < 0)
i = arr.length;
}
13. Loops should not perform any irrelevant iterations.
14. Each method should have at most one return statement.
15. Do not use a return statement in a void method.
16. Do not use a while loop when an if statement is appropriate for the code
segment. (In other words, do not write a while loop that is guaranteed to iterate
at most one time.)
Math 140 Programming Assignment 2 Deadline: Feb 27, 2019, 11:59 pm
17. Use “else if” when appropriate:
Example:
Instead of
if (a < 1){
a++;
}
if (a > 10){
a--;
}
use
if (a < 1){
a++;
}
else if (a > 10){
a--;
}
18. Separate code segments with a most one blank line. Note that a code segment
is a method, a loop or an if block. A single statement is usually not considered
to be a code segment.
19. A block comment near the top of the Java file with the following information
/*
Author: Your name and an acknowledgement of any person who assisted you in
this project.
Date: The date you completed the assignment.
Purpose: A description of the class.
*/
Math 140 Programming Assignment 2 Deadline: Feb 27, 2019, 11:59 pm
20. Write a block comment above each method and constructor with the following
information: Note that the terms Purpose, Parameters, and Return should
appear in every block comment.
/*
Purpose: A meaningful description of the method/constructor.
Parameters: Describe the purpose of each parameter
Return: A description of the return value.
*/
