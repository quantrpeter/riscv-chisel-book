#!/bin/bash

c=`docker ps -a|grep hello|wc -l`

if [ $c -eq 0 ]; then
	docker run --name hello -it -v .:/src quantrpeter/mycpu
else
	docker start hello
	docker attach hello
fi
