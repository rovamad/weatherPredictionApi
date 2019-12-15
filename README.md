# WeatherPredictionApi

### Proposito
Se buscaba consumir una API publica de condiciones climaticas que diera un pronostico para los siguientes 7 dias. Para tal fin se utilzó el api publico de Meteored. 

* [Meteored](https://www.meteored.cl/)

### Arquitectura
La respuesta del servicio era en formato XML por lo que se generó un Schema XSD para generar las clases java, la herramienta utilizada fue la siguiente.

* [XML to XSD](https://www.liquid-technologies.com/online-xml-to-xsd-converter)

Para generar las clases debe ejecutarse el siguiente comando en la raiz del proyecto luego de haber importado las dependencias de Gradle:

$ gradle xjc

Se adaptó el plugin JAXB2 para que funcione en Gradle, ya que está originalmente para Maven.

Para hacer las desconversión de XML a Objetos en java, se usa un MarshallHelper.

### Endpoints

Endpoint de ejemplo para servicio original de Meteored con respuesta en XML.

http://api.tiempo.com/index.php?api_lang=es&localidad=18578&affiliate_id=1k94hqd1gvgv

Tras ejecutar la aplicación en local, nuestro servicio queda en la siguiente ruta.

http://localhost:8080/suraTest/weatherPrediction/location/18578

### JSON Modelo
El Json generado por nuestro servicio viene ordenado de la siguiente manera.

```json
{
    "name": "Santiago de Chile [Región Metropolitana de Santiago;Chile]",
    "forecast": [
        {
            "day": "Domingo",
            "maxTemp": "29",
            "minTemp": "13",
            "definition": "Durante todo el dia Cielos despejados"
        },
        {
            "day": "Lunes",
            "maxTemp": "31",
            "minTemp": "14",
            "definition": "Durante todo el dia Cielos despejados"
        },
        {
            "day": "Martes",
            "maxTemp": "34",
            "minTemp": "16",
            "definition": "Durante todo el dia Cielos despejados"
        },
        {
            "day": "Miércoles",
            "maxTemp": "34",
            "minTemp": "17",
            "definition": "Durante todo el dia Cielos despejados"
        },
        {
            "day": "Jueves",
            "maxTemp": "27",
            "minTemp": "16",
            "definition": "Durante todo el dia Cielos despejados"
        },
        {
            "day": "Viernes",
            "maxTemp": "30",
            "minTemp": "14",
            "definition": "Durante todo el dia Cielos despejados"
        },
        {
            "day": "Sábado",
            "maxTemp": "32",
            "minTemp": "15",
            "definition": "Durante todo el dia Cielos despejados"
        }
    ]
}
```



### Test Unitarios
Para los Test Unitarios se utilizó Junit 4+, y se cubrieron aquellas clases criticas para el funcionamiento del ejercicio. Controllers y Servicios. Aquellas clases autogeneradas, pojo, helpers, settings. No deben ser consideradas para la cobertura.

