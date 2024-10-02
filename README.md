Sorting Students by Course in descending order

REQUIREMENT:

Situation

You work for a College as their Data Scientist and your job is to help the Professors manage the data that they receive from the College. For this assignment you need to help the Professors of 3 different classes with their student enrollment list.

The Professors were given a single CSV file that contains a "master list" of all students across all courses. But each Professor only wants to see a list of their own students (not the students who are in other classes).

Job

You will need to parse the Master List File and separate the data into 3 separate CSV files. Each CSV file should contain a list of students specific to that particular course (i.e. we're grouping the students by course).

For each of the 3 CSV files, you'll need to sort the students by grade in descending order.

The CSV output file names should be called: course1.csv, course2.csv, and course3.csv.

Hints
In order to sort an array, you'll need to figure out how to handle null entries in your array. If you're trying to use Arrays.sort(yourArray), and yourArray contains null values, the sort will crash. 
When writing to a file, you can use "\n" to write a new line to the file. Fore example: fileWriter.write("This is one line \n");
If you want to turn String input into an Integer, you can parse it like so: Integer myIntVal = Integer.parseInt(myStringVal);

Example Output

course1.csv

    Student ID,Student Name,Course,Grade
    28,Justin Conrad,COMPSCI 310,99
    37,Simone Scott,COMPSCI 312,91
    91,Donald Schultz,COMPSCI 321,87
    19,Blair Heaton,COMPSCI 309,87
    79,Kerys John,COMPSCI 319,87
    64,Jameson Best,COMPSCI 316,86
    ... rest of lines omitted ...

course2.csv

    Student ID,Student Name,Course,Grade
    89,Alison Murray,APMTH 134,93
    59,Amber-Rose Austin,APMTH 129,93
    68,Aran Rice,APMTH 131,89
    44,Brandan Mcbride,APMTH 127,89
    32,Veronica Dodd,APMTH 125,88
    ... rest of lines omitted ...

course3.csv

    Student ID,Student Name,Course,Grade
    15,Padraig Barry,STAT 236,93
    39,Zachariah Hutchinson,STAT 240,92
    33,Stewart Reed,STAT 239,90
    54,Franciszek Hartman,STAT 242,90
    6,Bodhi Stokes,STAT 234,86
    ... rest of lines omitted ...

© Coders Campus 2024 Version: 2.0.0.0 Privacy Policy | Terms of Service
