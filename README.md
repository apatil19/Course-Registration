# CSX42: Assignment 1
## Name: Aaditya Sakharam Patil
-----------------------------------------------------------------------
-----------------------------------------------------------------------
###Assuming you are in the directory containing this README
-----------------------------------------------------------------------

Following are the commands and the instructions to run ANT on project.
#### Note: build.xml is present in coursesRegistration/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile coursesRegistration/src/build.xml clean

Description: It cleans up all the .class files that were generated when 
you compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile coursesRegistration/src/build.xml all

Description: Compiles code and generates .class files inside the BUILD 
folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile coursesRegistration/src/build.xml run -Darg0=<input_file1.txt> -Darg1=<input_file2.txt> 
Note: Arguments accept the absolute path of the files.

-----------------------------------------------------------------------
## Description:
Time Complexity is O(n^2)

I have used ArrayList of type class Courses to store course details.
Switch case is used to get course preferences in a loop and then 
schedule them in class Allocation.
Results are stored in Class Results with arrayList of type class
Registration.

Implemented methods interfaces in Results class. 

-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating an official form will be
submitted to the Academic Honesty Committee of the Watson School to
determine the action that needs to be taken. "

Date: 09/21/2018


