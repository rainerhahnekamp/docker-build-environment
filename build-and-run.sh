#!/usr/bin/env bash

docker build -t legacy .
docker run -it --rm legacy