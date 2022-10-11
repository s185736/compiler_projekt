ANTLRJAR = /usr/local/lib/antlr-4.7.2-complete.jar
antlr4 = java -jar $(ANTLRJAR)
grun   = java org.antlr.v4.gui.TestRig
export CLASSPATH := .:$(ANTLRJAR):${CLASSPATH}
SRCFILES = main.java Environment.java
GENERATED = implParser.java implBaseVisitor.java implVisitor.java implLexer.java

all:
	make test

main.class:	$(SRCFILES) $(GENERATED) impl.g4
	javac  $(SRCFILES) $(GENERATED)

implLexer.java:	impl.g4
	$(antlr4) -visitor impl.g4

implLexer.class: implLexer.java
	javac $(GENERATED)

test:	implLexer.class main.class impl.g4 input.txt
	java main input.txt

tree:	implLexer.class impl.g4 input.txt
	$(grun) impl start -gui -tokens input.txt

clean:
	rm $(GENERATED) *.class *.interp *.tokens implBaseListener.java implListener.java