#!/bin/bash

# Create an image to run application in docker.
# Prerequisites:
# 1. run createJar.sh

mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)
docker build . -t techtest