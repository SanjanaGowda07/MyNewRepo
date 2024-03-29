FROM openjdk:17-jdk-slim
WORKDIR /containerManagement
COPY . .
RUN gradle clean build
CMD gradle bootRun