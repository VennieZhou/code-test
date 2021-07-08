# code-test
Code-test is a program built in Clojure for checking whether a string of parentheses is valid.


## Usage

`(isValid "()")      // return true;`

` (isValid "([)]")     // return false;`



## How to Build

 - Build a new clojure project using command: 
   
       lein new app code-test ;
 - Run test cases using command: 
   
       lein do test ;
 - Package up the project files and all dependencies into a jar file using command: 
   
       lein uberjar ;
 - Generate a pom.xml file for Maven interoperability using command: 
   
       lein pom ;

## How to Run
 Run the program using command: 

    java -jar target/uberjar/code-test-0.1.0-SNAPSHOT-standalone.jar ;


## Program Development

#### Ideas
- The feature of stack FILO helps parenthesis sorting in this program.

- That is, if an opening parenthesis is in the peek the stack, a closing parenthesis will push out the opening parenthesis.
- Then the stack is still empty after finished looping all the parentheses.
- Otherwise, the closing parenthesis will be pushed in the stack, and the stack will not be empty.

#### Implementation
- Create a hash-map to construct the corresponding relationship between opening and closing parentheses: key for closing parentheses, value for opening parentheses:
 
      (def parentheses(hash-map ")" "(" , "]" "[", "}" "{"))
- Set up a new empty stack, loop each char of the string and verify it according to the process.
 
      if parentheses.containsKey(char) 
  
      and stack != empty 
  
      and stack.peek = parentheses.get(char) :
  
      stack pop;

      Otherwise：
   
      stack push(char)
  

  



### Problems

The program should return false and break the loop in a condition where the stack is empty, or the peek of stack is not the corresponding opening parenthesis if a closing parenthesis is on the process.

In this program, it will not break the loop but run until finish the loop, and return false.



