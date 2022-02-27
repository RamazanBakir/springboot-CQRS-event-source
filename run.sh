#!/bin/bash
docker start adminer
if [ $? -eq 0 ]
then
echo "✅ adminer running"
else
echo "❌ adminer have a problem"
fi

docker start axon-server
if [ $? -eq 0 ]
then
echo "✅ axon-server running"
else
echo "❌ axon-server have a problem"
fi

docker start mongo-container
if [ $? -eq 0 ]
then
echo "✅ mongo-container running"
else
echo "❌ mongo-container have a problem"
fi

docker start mysql-container
if [ $? -eq 0 ]
then
echo "✅ mysql-container running"
else
echo "❌ mysql-container have a problem"
fi

echo " All Running Services :  "
docker ps
