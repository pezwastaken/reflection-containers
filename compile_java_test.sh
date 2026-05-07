cd "$1" && javac --release 8 *.java && jar cvfm main.jar manifest.txt *.class


