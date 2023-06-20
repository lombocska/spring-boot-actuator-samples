## Sample for spring-boot-admin-starter-server app

Codecentric spring-boot-admin has 2 different dependencies.
This app makes an example of using the server dependency for allowing other spring-boot apps to register themselves as a client.

This app runs on port 8085.


### spring-boot-admin server dependency

```xml
<dependency>
    <groupId>de.codecentric</groupId>
    <artifactId>spring-boot-admin-starter-server</artifactId>
    <version>3.0.4</version>
    <scope>compile</scope>
</dependency>
```

For registering your spring-boot app to spring-boot-admin dashboard you need to include client dependency and set this property
in application.yml.

```xml
<dependency>
    <groupId>de.codecentric</groupId>
    <artifactId>spring-boot-admin-starter-client</artifactId>
    <version>3.0.4</version>
</dependency>
```

```yaml
spring:
  boot:
    admin:
      client.url: http://localhost:8085
```

If your spring-boot app successfully registered itself to this admin server, logs shoulld contain something like this:

`2023-06-17T18:38:43.953+02:00  INFO 19819 --- [registrationTask1] d.c.b.a.c.r.ApplicationRegistrator       : Application registered itself as edcc99c2e35d
`

