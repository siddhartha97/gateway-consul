#!/bin/bash

kill $(ps aux | grep 'gradle' | awk '{print $2}')