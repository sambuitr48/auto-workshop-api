# Imagen base de OpenJDK compatible con Java 20
FROM openjdk:20-jdk-slim

# Directorio de trabajo en el contenedor
WORKDIR /app

# Copiar el archivo JAR generado en el contenedor
COPY target/auto-workshop-api-0.0.1-SNAPSHOT.jar app.jar

# Puerto expuesto
EXPOSE 8080

# Comando de inicio
ENTRYPOINT ["java", "-jar", "app.jar"]
