#!/bin/bash

# Run application in docker.
# Prerequisites:
# 1. run createJar.sh
# 2. run createImage.sh

docker run -d \
    --name techtest \
    --security-opt=no-new-privileges \
    -p 8080:8080 \
    techtest