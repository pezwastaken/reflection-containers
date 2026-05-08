
to build the two images:

    sudo docker build -t solar-analysis solar-tai-e/

    sudo docker build -t doop-analysis doop/


---

then to run the container against a test program (for example 2):

    ./solar_run.sh 2

    or

    ./doop_run.sh 2


watch out for ram usage when running the doop container.

---

you can then find the results in:
- solar_results/call-edges.txt
- doop_results/id/CallGraphEdge.csv


the solar container dumps to stdout the unsound reflective calls.

