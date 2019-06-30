FROM mysql:latest
ENV MYSQL_DATABASE mydb
COPY ./conf.d /etc/mysql/conf.d:ro
COPY ./sql-scripts/ /docker-entrypoint-initdb.d/