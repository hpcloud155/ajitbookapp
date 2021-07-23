FROM adoptopenjdk/openjdk11
WORKDIR /app
COPY target/demo-1.0.jar  /app
EXPOSE 8082
COPY wait.sh /app/wait.sh
RUN chmod +x /app/wait.sh
CMD ["java","-jar","demo-1.0.jar"]