PARCIAL DESARROLLO DE SOFTWARE
Banca Palazzo Marquez - 50122 - 3k9 

Este proyecto implementa un servicio que permite detectar si un humano es mutante basándose en su secuencia de ADN. Fue desarrollado en Java utilizando el framework Spring Boot.

El mismo cuenta con 3 niveles, el primero donde se  implementa la  función isMutant en una arquitectura con capas de Controlador, Servicio y Repositorio. En el segundo se crea una API REST desplegada en Render. Y por ultimo, se integra una base de datos H2 para almacenar registros de ADN y exponer estadísticas de las verificaciones.

Para este proyecto se utiliza:
JAVA, MAVEN (construcción de proyecto y dependencias), SPRING BPPT ( servicio API), H2 DATABASE (base de datos), JMETER (pruebas de carga), POSTMAN (pruebas de la API).

EJECUCIÓN:
1- clonar repositorio: https://github.com/bianpalazzo/ParcialDesarrollo.git 
2- abrir en Intellij Idea.
3- ejecutar el proyecto.

VERIFICACIÓN DE LA API
para detectar si el ADN es de un mutante:
tipos de respuesta al enviar una matriz
200 OK: El ADN pertenece a un mutante.
403 Forbidden: El ADN no pertenece a un mutante.

VERIFICACIÓN DE CARGA CON JMETER.
Para garantizar que la API pueda soportar tráfico de 100 a 1 millón de peticiones por segundo, se realizaron pruebas de carga con Apache JMeter. El archivo de configuración de pruebas (mutante_detector.jmx) 

Configuración de HTTP Request en JMeter:
Agrega un HTTP Request Sampler.
Completa los campos como sigue:
Server Name or IP: localhost
Port Number: 8080
Protocol: http 
Path: /mutant/ 
Method: POST
En Body Data, pega el siguiente JSON:
{
  "dna": ["ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"]
}
Agrega un View Results Tree.
Guarda la configuración.
Ejecuta la prueba haciendo
Ve a View Results Tree y deberías ver la solicitud y respuesta como se mostró en Postman.
