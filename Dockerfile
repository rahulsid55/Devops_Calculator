FROM openjdk:11
COPY ./target/CalculatorDevops-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-cp", "CalculatorDevops-1.0-SNAPSHOT-jar-with-dependecies.jar", "Calculator"]

