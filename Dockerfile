FROM eclipse-temurin:23-alpine
COPY build/libs/WhatsappSampleApp-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_TOOL_OPTIONS="-XX:MaxRAMPercentage=100.0 -Xmx512m -Xms256m"
ENV JAVA_OPTS="-XX:+UnlockExperimentalVMOptions -XX:+UseContainerSupport"
EXPOSE 80
ENTRYPOINT ["java", "-jar", "/app.jar"]