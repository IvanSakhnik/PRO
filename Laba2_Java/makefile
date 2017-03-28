.PHONY: clean

Laba2.class: Laba2.java Inp/RandomArray.class Sh/Search.class Out/OutputArray.class
	javac Laba2.java
Inp/RandomArray.class: RandomArray.java
	javac -d . RandomArray.java
Out/OutputArray.class: OutputArray.java
	 javac -d . OutputArray.java
Sh/Search.class: Search.java
	javac -d . Search.java 
generateJar:
	 jar -cfm Laba2.jar main.manifest Laba2.class Inp/RandomArray.class  Out/OutputArray.class Sh/Search.class
clean:
	rm -rf *.class
	rm -r Out Sh Inp Laba2.jar

