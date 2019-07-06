FROM rabbitmq:3.5.7-management

MAINTAINER "TWCAM"

COPY rabbitmq.config /etc/rabbitmq/
COPY custom_definitions.json /etc/rabbitmq/

CMD ["rabbitmq-server"]
