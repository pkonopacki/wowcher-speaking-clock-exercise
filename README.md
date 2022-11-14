Speaking clock
==============

Specification
-------------
1. Given a 24 hour clock convert the current time into words
	e.g. "08:34" should be converted to "It's eight thirty four"

2. Return Midday and Midnight as "It's Midday" and "It's Midnight"

The time allotted to the test is 1 hour. Your solution will be judged on a number of criteria pertinent to good software development practice. 

Incomplete solutions are acceptable. Please note any assumptions you make, or any further questions you have regarding the requirements.

For the purposes of this exercise, please use Java 8 libraries.

Note
====
You can use tests to demonstrate your solution since there is no specific requirement to allow the application as a whole to be run.


How to run
==========
As instructed above, there is no main method to be run, thus the results of existing tests should serve as reference.

Java 8, Maven 3.8.1 (bundled with IntelliJ Idea IDE version 2022.2.1), maven-compiler-plugin 3.3 and Junit 4.12 were used as found in pom.xml file

There was no specific requirement around efficiency of the algorithm, static methods were used, the focus was put on readability of the code and tests.

The conversion logic is contained in single static method SpeakingClock.sayTheTime(int h, int m). Whole parsing functionality can be found in TimeParser class. There are corresponding tests for both.

Please use the command "mvn clean test" and the execution report can be found in the <path to the parent folder>/wowcher-speaking-clock-exercise-9846de457d98/target/surefire-reports

The test report should be printed on the screen as well.