# Add base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add maintainer info
LABEL maintainer="dilaninjihia@gmail.com"

# Install maven
RUN apk update && apk add maven

RUN mkdir -p /project/

COPY . /project

# Define the project's working directory
WORKDIR /project




