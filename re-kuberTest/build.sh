#!/usr/bin bash

gradle clean
gradle bootjar

sudo docker build -t registry.cn-qingdao.aliyuncs.com/namimono/re-kuber:0.0.1 .

