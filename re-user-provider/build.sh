#!/usr/bin bash

gradle clean
gradle bootjar

sudo docker build -t registry.cn-qingdao.aliyuncs.com/namimono/recloud-re-user-provider:0.0.1 .

