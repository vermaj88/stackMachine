The class with the main method is StackMachine.
Import this project in IntelliJ  and run the StackMachine class.

Note the Stack maintains the list of commands that have  been executed in order to implement the 
UNDO command. The Command design pattern is used to implement the commands.

A screenshot of the run configuration is  in the project : refer to runConfiguration.png



When the project is run it will ask you for input like the following :
EnterCommand:

Sample console output from a test run is as follows:

/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=65418:/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home/lib/tools.jar:/Users/juhiverma/IdeaProjects/stackMachine/out/production/stackMachine:/Users/juhiverma/.m2/repository/org/junit/jupiter/junit-jupiter/5.4.2/junit-jupiter-5.4.2.jar:/Users/juhiverma/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.4.2/junit-jupiter-api-5.4.2.jar:/Users/juhiverma/.m2/repository/org/apiguardian/apiguardian-api/1.0.0/apiguardian-api-1.0.0.jar:/Users/juhiverma/.m2/repository/org/opentest4j/opentest4j/1.1.1/opentest4j-1.1.1.jar:/Users/juhiverma/.m2/repository/org/junit/platform/junit-platform-commons/1.4.2/junit-platform-commons-1.4.2.jar:/Users/juhiverma/.m2/repository/org/junit/jupiter/junit-jupiter-params/5.4.2/junit-jupiter-params-5.4.2.jar:/Users/juhiverma/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.4.2/junit-jupiter-engine-5.4.2.jar:/Users/juhiverma/.m2/repository/org/junit/platform/junit-platform-engine/1.4.2/junit-platform-engine-1.4.2.jar com.stack.StackMachine

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


