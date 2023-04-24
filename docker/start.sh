#!/bin/bash

NETWORK_ID=`docker network ls --filter name=actuator-sample -q`

# test NETWORK_ID for emptiness and create network is not available
[[ -z "${NETWORK_ID// }" ]] && docker network create actuator-sample

docker-compose up --build --remove-orphans