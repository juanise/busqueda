#!/usr/bin/env sh

IMAGE="twcammaster.uv.es/proyecto1-rabbitmq-server"
TAG="latest"
CONTAINER="proyecto1-rabbitmq-server"

#############################################
# - TWCAM, 06/2019
#############################################

  echo "Initializing ${CONTAINER}..."

  docker run -d\
    --hostname $CONTAINER \
    --name $CONTAINER \
    -p 15672:15672 \
    -p 4369:4369 \
    -p 5672:5672 \
    -p 25672:25672 \
    -p 35197:35197 \
    -e RABBITMQ_ERLANG_COOKIE='example secret' \
    ${IMAGE}:${TAG}


STARTED=$(docker inspect --format="{{ .State.StartedAt }}" $CONTAINER)
NETWORK=$(docker inspect --format="{{ .NetworkSettings.IPAddress }}" $CONTAINER)
CONTAINER_ID=$(docker inspect --format="{{ .Id }}" $CONTAINER)

echo -e "OK - $CONTAINER is running. \n  IP: $NETWORK\n  CONTAINER ID: $CONTAINER_ID\n  StartedAt: $STARTED"
