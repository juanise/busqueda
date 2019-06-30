FROM openjdk:8

MAINTAINER "TWCAM"

ADD target/busqueda-0.0.1.jar busqueda-0.0.1.jar
EXPOSE 8081
ENTRYPOINT [ "java", "-jar", "busqueda-0.0.1.jar" ]
ADD https://github.com/ufoscout/docker-compose-wait/releases/download/2.2.1/wait /wait
RUN chmod +x /wait
CMD /wait