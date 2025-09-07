#!/bin/bash

# Script generado por IA para correr el programa 100 veces y guardarlo en un archivo .csv
RESULTS_FILE="../benchmark_results.csv"

# Start fresh CSV
echo "Length,Time(ms)" > "$RESULTS_FILE"

# Run ScriptTest 1000 times and append output
for i in {1..500}; do
  java -cp . ScriptTest >> "$RESULTS_FILE"
done
