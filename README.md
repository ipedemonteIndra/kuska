# ejemplo kuska
Spring backend hexagonal

Setup :
- Open JDK 1.8
- Maven 3.3.3
Ejecutar: mvn clean install

Base de Datos
Crear base de datos kuska e importal el archivo kuska.user.json

Configuracion Api

Ejecutar proyecto e importar las siguientes url en postman o soapoui
GET http://localhost:8071/api/users/{userId}
POST http://localhost:8071/api/users/
PUT http://localhost:8071/api/users/