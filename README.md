# teste-basico-springboot
Projeto para testar conhecimento básico em Spring Boot

## Requisitos
- Java JDK;
- Maven;

## Compilar projeto
- `./mvnw clean install`

## Subir projeto
- Modo normal: `./mvnw spring-boot:run`
- Modo debug: `./mvnw spring-boot:run -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005"`

## Rodar teste
- `./mvnw test`

## Objetivo
1. Compile o projeto, caso tenha erros de compilação ou de teste, resolva-os.
2. Acessar o endpoint </hello>.
