# Usar una imagen base oficial de Java
FROM openjdk:17-jdk-alpine

# Establecer el directorio de trabajo en el contenedor
WORKDIR /app

# Copiar el archivo pom.xml y el directorio src al directorio de trabajo
COPY pom.xml .
COPY src ./src

# Descargar todas las dependencias. Esto se hace en una capa separada para aprovechar el caché de Docker
RUN mvn dependency:go-offline

# Copiar el resto de los archivos y construir el proyecto
COPY . .
RUN mvn package

# Exponer el puerto en el que la aplicación corre
EXPOSE 8080

# Ejecutar la aplicación
CMD ["java", "-jar", "target/ParcialDesarrollo.jar"]
