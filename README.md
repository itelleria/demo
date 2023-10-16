# Getting Started

## Building

### Old way

```shell
mvn clean package -DskipTests
docker build -t eu.arima/demo:1.0 .
docker run -p 8080:8080 eu.arima/demo:1.0
```
