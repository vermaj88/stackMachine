The class with the main method is StackMachine.
Import this project in IntelliJ  and run the StackMachine class.

Note the Stack maintains the list of commands that have  been executed in order to implement the 
UNDO command. The Command design pattern is used to implement the commands.

A screenshot of the run configuration is  in the project : refer to runConfiguration.png



When the project is run it will ask you for input like the following :
EnterCommand:

Sample console output from a test run is as follows:

EnterCommand:
PUSH 1.5
Top of Stack item:1.5
EnterCommand:
PUSH -3.5
Top of Stack item:-3.5
EnterCommand:
PUSH -1
Top of Stack item:-1.0
EnterCommand:
MUL
Top of Stack item:3.5
EnterCommand:
ADD
Top of Stack item:5.0
EnterCommand:
INV
Top of Stack item:0.2
EnterCommand:
print
[0.2]
EnterCommand:

----
There is a Junit test class called StackTest in the test package that can be run.


