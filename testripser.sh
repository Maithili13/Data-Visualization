#!/bin/sh

echo -n 'Where are the face frames?'
read dirpath
cd $dirpath
ls -1 | wc -l
echo -n 'Where is Ripser?'
read ripserpath
echo -n 'Where should the Persistence Diagrams be?'
read PDpath


 counter=1
for f in "$dirpath"/*; do
  counter=$((counter+1))
 cd $ripserpath
./ripser --format point-cloud $f > $PDpath/PersistenceDiagramF$counter.txt
done
