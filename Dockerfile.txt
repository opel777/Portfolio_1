
FROM amazoncorretto:1.8-alpine-jdk
MANTEINER Gustavo_Villegas
COPY target/Gustavo_Villegas-Portfolio_1-0.0.1-SNAPSHOT.jar Gustavo_Villegas-Portfolio_1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Gustavo_Villegas-Portfolio_1-0.0.1-SNAPSHOT.jar"]