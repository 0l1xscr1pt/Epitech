#!/bin/bash

read number

if [ $((number % 2)) -eq 0 ]
then
    echo "Even"
else
    echo "Odd"
fi
