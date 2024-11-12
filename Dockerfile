# Usa una imagen completa de Maven para compilar el proyecto
FROM maven:3.8.6-openjdk-17 AS build

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Copia todos los archivos del proyecto al contenedor
COPY . .

# Ejecuta la compilación de Maven para generar el archivo JAR
RUN mvn clean package -DskipTests

# Usa una imagen completa de OpenJDK para ejecutar el archivo JAR
FROM openjdk:17-jdk

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR generado desde el contenedor de compilación
COPY --from=build /app/target/auto-workshop-api-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto en el que se ejecuta la aplicación
EXPOSE 8080

# Comando para ejecutar el JAR
CMD ["java", "-jar", "app.jar"]
