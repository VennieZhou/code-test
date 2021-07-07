# isValid

isValid is a program built in Clojure for checking a string of parentheses whether is valid.


## Usage

`(isValid "()")      // return true;`

` (isValid "([)]")     // return false;`



## Ideas

 1. Build a new clojure project using command: `lein new app code-test` ;
 2. Find the main project in /src directory and develop the program in Clojure;
 3. Check errors and fix tests using command: `lein do test` ;
 4. Package up the project files and all dependencies into a jar file using command: `lein uberjar` ;
 5. Write a pom.xml file to disk for Maven interoperability using command: `lein pom` ;
 6. Program runs successfully using command: `java -jar target/uberjar/code-test-0.1.0-SNAPSHOT-standalone.jar` ;


## Explanations

- The feature of stack FILO helps parenthesis sorting in this program.
- That is, if an opening parenthesis is on the stack, a closing parenthesis will push out the opening parenthesis.
- Then the stack is still empty after finished looping all the parentheses.
- Otherwise, the closing parenthesis will be pushed in the stack, and the stack will not be empty.
- Create a hash-map to construct the corresponding relationship between opening and closing parentheses: key for closing parentheses, value for opening parentheses; 
- Set up a new null stack, loop the string and judge one by one according to the process.



### Problems

The program should return false and break the loop in a condition where the stack is not empty and the peek of stack is not the corresponding opening parenthesis.
In this program, it will not break the loop but run until finish the loop, and return false.


## License

Copyright © 2021 Vennie
