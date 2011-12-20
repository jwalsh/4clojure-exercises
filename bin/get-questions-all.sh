#!/bin/sh

FILE=all.csv
rm $FILE

for Q in {1..135}
do
    DESC=$(lynx --width=200 --dump  http://www.4clojure.com/problem/$Q | grep -A1 Topics: | tail -n 1)
    R="$Q,$DESC"
    echo $R >> $FILE
    echo $R
done

echo See results in $FILE