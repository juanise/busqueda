# PROYECTO TWCAM 
## Desplegar localmente api búsqueda con Mysql y Rabbitmq usando docker-compose
Para desplegar el proyecto original ve a la carpeta raíz del proyecto búsqueda y ejecuta:
```
 docker-compose up
```
Si modificas la configuración de un servidor o el código de la aplicación debes generar las imágenes nuevamente en tu ordenador. 

Para ello sigue las siguientes instrucciones:
### Dar permisos de ejecución a los scripts
```
chmod a+x createImage.sh && chmod a+x server-mysql/createImage.sh && chmod a+x server-rabbitmq/createImage.sh 
``` 
### Crear las imágenes docker                  
* Importante: Generar el .jar del api búsqueda, para ello puedes usar
```
 mvn install
```
Ahora, para generar las imágenes ejecuta
```
sh createImage.sh; \
cd server-mysql/; \
sh createImage.sh; cd ..; \
cd server-rabbitmq/; \
sh createImage.sh; cd ..
```
Por último despliega la aplicación usando
```
 docker-compose up
```
### Verificación
Si todo a ido bien visita [localhost:8081/swagger-ui.html](http://localhost:8081/swagger-ui.html)

### Pruebas
Puedes realizar una reserva utilizando los siguientes datos.
```
{
  "agenciaViajes": {
    "codigo": "VAL001",
    "id": 1
  },
  "costoReserva": 999,
  "equipaje": true,
  "estadoReserva": "pendiente",
  "fechaReserva": "2019-06-28T17:09:48.921Z",
  "id": 999,
  "ida": {
    "estadoVuelo": "pendiente",
    "fechaLlegada": "2019-06-28T17:09:48.921Z",
    "fechaSalida": "2019-06-28T17:09:48.921Z",
    "id": 1238,
    "tarifas": 999,
    "tarjetaEmbarque": "1234",
    "tipoVuelo": true
  },
  "numeroAsiento": "365",
  "pasajero": {
    "apellidoMaterno": "Wilmer",
    "apellidoPaterno": "Moina",
    "dniPassaporte": "y5678j",
    "id": 1234,
    "name": "wmoina"
  },
  "prioritario": true,
  "vuelta": {
    "estadoVuelo": "pendiente",
    "fechaLlegada": "2019-06-28T17:09:48.921Z",
    "fechaSalida": "2019-06-28T17:09:48.921Z",
    "id": 3456,
    "tarifas": 88,
    "tarjetaEmbarque": "4321",
    "tipoVuelo": true
  }
}
```
### Borrar contenedores
```
docker rm -f (docker ps -qa)
```
### Autores
* Juan N.
* Alberto R.
* Wilmer M.
