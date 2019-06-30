#!/usr/bin/env sh

IMAGE="twcammaster.uv.es/proyecto1-api-busqueda"
TAG="latest"

#############################################
# - TWCAM, 06/2019
#############################################

  echo "Creating ${IMAGE}..."

  docker build -t $IMAGE:$TAG .