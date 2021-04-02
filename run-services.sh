#!/bin/bash

cd service2
gradle run &
cd ../service1
gradle run &
cd ../gateway
gradle bootRun &
cd ..

