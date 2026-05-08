# the actual solar command
#
# java -jar tai-e-all-0.5.2.jar \
#   -acp path/to/.jar -cp path/to/directory/with/.class \
#   -m Main -java 8 \
#   -a "pta=cs:2-type;reflection-inference:solar;distinguish-string-constants:reflection;handle-invokedynamic:true" \
#   -a "cg=algorithm:pta;dump-call-edges:true;dump-methods:true"


mkdir solar_results

./compile_java_test.sh "$1" && \
	sudo docker run --name solar --rm -it \
	-v "$(pwd)/$1":/analysis_input \
	-v "$(pwd)/solar_results":/tai-e/Tai-e/output \
	solar-analysis -acp /analysis_input/main.jar \
		-cp /analysis_input \
		-m Main -java 8 \
		-a "pta=cs:2-type;reflection-inference:solar;distinguish-string-constants:reflection;handle-invokedynamic:true" \
		-a "cg=algorithm:pta;dump-call-edges:true;dump-methods:true"


