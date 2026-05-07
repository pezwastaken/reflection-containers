#!/bin/bash

# ./doop -a context-insensitive -i ../../reflection-tests/2/ReflectionDemo1.jar --platform java_8 --reflection --reflection-method-handles --reflection-classic

# docker build -t doop-analysis .

./compile_java_test.sh "$1" && \
	sudo docker run --name doop --rm -it \
	-v "$(pwd)/$1":/analysis_input \
	doop-analysis -a context-insensitive --app-only -i /analysis_input/main.jar --platform java_8 --reflection --reflection-method-handles --reflection-classic


