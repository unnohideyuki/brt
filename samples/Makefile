all:	Sample1 Sample2 Sample7

brtsyn:
	javac -cp "../src" ../src/jp/ne/sakura/uhideyuki/brt/brtsyn/*.java

runtime:
	javac -cp "../src" ../src/jp/ne/sakura/uhideyuki/brt/runtime/*.java

Sample1:	brtsyn runtime
	javac -cp "../src;." Sample1.java

run1:
	java -ea -cp "../src;." Sample1

Sample2:	brtsyn runtime
	javac -cp "../src;." Sample2.java

run2:
	java -ea -cp "../src;." Sample2

Sample7:	brtsyn runtime
	javac -cp "../src;." Sample7.java

run7:
	java -ea -cp "../src;." Sample7
