#!/bin/sh

. ./questions 

for Q in 15 16 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 38 39 40 41 42 43 44
do
    DESC=$(lynx --dump  http://www.4clojure.com/problem/$Q | grep -A1 Topics: | tail -n 1)
    echo $Q,$DESC
done