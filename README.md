Spring Boot REST api with H2

-mvn clean install
-java -jar target/*.jar

[POST]
http://localhost:9001/user/
{
    "userId": 1,
    "userName": "Manu",
    "userAddress": "India"
}

[GET]
http://localhost:9001/user/1
{
    "userId": 1,
    "userName": "Manu",
    "userAddress": "India"
}
