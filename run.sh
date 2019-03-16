#!/bin/bash
file="./run.pid"
if [ -f "$file" ]
then
	echo "Program is already running"
else
    echo "Running program..."
	nohup java -jar bin/`ls bin/` > /dev/null 2>&1 & echo $! > run.pid
fi



