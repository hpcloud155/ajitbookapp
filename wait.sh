#!/bin/sh

while ! nc -z mysqldb 3306 ; do
    echo "Waiting for the db Server"
    sleep 3
done