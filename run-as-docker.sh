#!/bin/bash
docker build -t alfdockerberlin.springscaffold .
docker run -p 8080:8080 -e "JAVA_OPTS=-Ddebug -Xmx128m" alfdockerberlin.springscaffold
