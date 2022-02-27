#!/bin/bash
docker stop $(docker ps -a -q)
if [ $? -eq 0 ]
then
echo "✅ All services stop"
else
echo "❌ All services not stopped"
fi
