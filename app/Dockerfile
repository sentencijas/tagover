FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY src ./src

EXPOSE 9090

RUN mkdir -p out && \
    javac src/Main.java -d out

CMD ["java", "-cp", "out", "Main"]
