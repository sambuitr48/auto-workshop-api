# Imagen base de OpenJDK compatible con Java 20
FROM openjdk:20-jdk-slim

# Directorio de trabajo en el contenedor
WORKDIR /app

# Variable para el nombre del archivo JAR
ARG JAR_FILE=target/auto-workshop-api-0.0.1-SNAPSHOT.jar

# Copiar el archivo JAR generado al contenedor
COPY ${JAR_FILE} app.jar

# Puerto expuesto
EXPOSE 8080

# Comando de inicio
ENTRYPOINT ["java", "-jar", "app.jar"]
