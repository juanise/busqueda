#!/usr/bin/env sh

IMAGE="twcammaster.uv.es/proyecto1-api-busqueda"
TAG="latest"
CONTAINER="proyecto1-proyecto1-api-busqueda"

#############################################
# - TWCAM, 06/2019
#############################################

  echo "Initializing ${CONTAINER}..."
 
  docker run -d\
    --hostname $CONTAINER \
    --name $CONTAINER \
    -p 8081:8081 \
    -e SERVER_NAME='mysql' \
    ${IMAGE}:${TAG}

STARTED=$(docker inspect --format="{{ .State.StartedAt }}" $CONTAINER)
NETWORK=$(docker inspect --format="{{ .NetworkSettings.IPAddress }}" $CONTAINER)
CONTAINER_ID=$(docker inspect --format="{{ .Id }}" $CONTAINER)

echo -e "OK - $CONTAINER is running. \n  IP: $NETWORK\n  CONTAINER ID: $CONTAINER_ID\n  StartedAt: $STARTED"
