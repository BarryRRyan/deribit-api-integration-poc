#!/bin/bash

# Run application locally.
# Prerequisites:
# 1. run createJar.sh

java -jar ./target/$(ls ./target | grep '.jar')