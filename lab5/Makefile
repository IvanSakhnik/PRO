Main.jar: Main.class Producer.class CommonStack.class CommonVariables.class Consumer.class Global.class Main.manifest
	jar cvfm Main.jar Main.manifest Main.class Producer.class CommonStack.class CommonVariables.class Consumer.class Global.class

Main.class: Main.java
	javac Main.java

Producer.class: Producer.java
	javac Producer.java

CommonStack.class: CommonStack.java
	javac CommonStack.java

CommonVariables.class: CommonVariables.java
	javac CommonVariables.java

Consumer.class: Consumer.java
	javac Consumer.java

Global.class: Global.java
	javac Global.java

Main.manifest:
	echo "No manifest file!"

.PHONY: clean
clean:
	rm Main.class Producer.class CommonStack.class CommonVariables.class Consumer.class Global.class Main.jar 

run: Main.jar
	java -jar Main.jar
