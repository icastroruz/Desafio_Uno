# Desafio

Este proyecto expone un API REST que entrega la siguiente información:

*id*: identificador
*fechaCreacion*: Fecha de inicio de la secuencia
*fechaFin*: Fecha de fin de la secuencia
*fechasFaltantes*: Lista de fechas faltantes de Json entregado.
```json
{
    "id": 6,
    "fechaCreacion": "1968-08-01",
    "fechaFin": "1971-06-01",
    "fechasFaltantes": [
      "1968-08-01",
      "1968-09-01",
      "1968-10-01",
      "1968-11-01",
      "1968-12-01",
      "1969-01-01",
      "1969-02-01",
      "1969-04-01",
      "1969-06-01",
      "1969-07-01",
      "1969-08-01",
      "1971-05-01"]
}

```
*Nota*:
El formato de las fechas es yyyy-MM-dd

# Detalle de los sistemas

Java 8
Spring-Boot 2.1.5.RELEASE
Maven 3


# Compilar y ejecutar el proyecto

Para copilar el proyecto se requiere Java y Maven instalado.
Ingresar al directorio *RestIC* ejecutar el siguiente comando *maven*

```bash
mvn package
```

Luego de compilar el proyecto ingresar al directorio *target* ejecutar el siguiente comando *java*

```bash
java -jar target/RestIC-0.0.1-SNAPSHOT.jar
```
*Nota*:
Debe estar disponible el puerto *8080* en el PC donde se ejecute esta API

# Consumir la API

Para realizar la prueba de consumir api y comprobar su resultado se debe contar con SoapUI o alguna herramienta para consumir API
Se debe enviar por metodo POST el json. Ejemplo:
{
    "id": 6,
    "fechaCreacion": "1968-08-01",
    "fechaFin": "1971-06-01",
    "fechas": [
      "1969-03-01",
      "1969-05-01",
      "1969-09-01",
      "1971-05-01"]
}
la URL para consumir es:
http://localhost:8080/DesafioPrevired/fechasFaltantes

