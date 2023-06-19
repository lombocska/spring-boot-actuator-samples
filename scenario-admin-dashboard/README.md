## Sample for actuator generated endpoints (simple)


This is the very basic scenario. No security at all.
There are 13 generated endpoints by actuator under localhost:8080/actuator/...
Docs for the endpoints is [here](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html#actuator.endpoints).

### Application Information

Enabling git, env and java info in [application.yml](src/main/resources/application.yml),
adding [build-info](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html#actuator.endpoints.info.build-information) goal to [pom.xml](pom.xml) 
and [custom application infromation](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html#actuator.endpoints.info.custom-application-information) to [application.yml](src/main/resources/application.yml)
gives info for you under **_localhost:8080/actuator/info_**.

Example of generated infos:

```json
{
    "app":
    {
        "encoding": "UTF-8",
        "java":
        {
            "source": "17.0.7",
            "target": "17.0.7"
        }
    },
    "git":
    {
        "local":
        {
            "branch":
            {
                "ahead": "0",
                "behind": "0"
            }
        },
        "commit":
        {
            "id":
            {
                "describe-short": "546d6f5-dirty",
                "abbrev": "546d6f5",
                "full": "546d6f5443ef9029f101646f2b8537d3b685a146",
                "describe": "546d6f5-dirty"
            },
            "message":
            {
                "short": "first commit",
                "full": "first commit"
            },
            "user":
            {
                "name": "xx",
                "email": "xx.xx@gmail.com"
            },
            "author":
            {
                "time": "2023-04-24T10:25:24+0200"
            },
            "committer":
            {
                "time": "2023-04-24T10:25:24+0200"
            },
            "time": "2023-04-24T08:25:24Z"
        },
        "branch": "main",
        "build":
        {
            "time": "2023-04-24T09:04:22Z",
            "version": "0.0.1-SNAPSHOT",
            "host": "xxx.local",
            "user":
            {
                "name": "xx",
                "email": "xx.xx@gmail.com"
            }
        },
        "tags": "",
        "total":
        {
            "commit":
            {
                "count": "1"
            }
        },
        "closest":
        {
            "tag":
            {
                "commit":
                {
                    "count": ""
                },
                "name": ""
            }
        },
        "remote":
        {
            "origin":
            {
                "url": "git@github.com:lombocska/spring-boot-actuator-samples.git"
            }
        },
        "dirty": "true"
    },
    "build":
    {
        "artifact": "simple",
        "name": "simple",
        "time": "2023-04-24T09:04:21.145Z",
        "version": "0.0.1-SNAPSHOT",
        "group": "io.lombocska"
    },
    "java":
    {
        "version": "17.0.7",
        "vendor":
        {
            "name": "Amazon.com Inc.",
            "version": "Corretto-17.0.7.7.1"
        },
        "runtime":
        {
            "name": "OpenJDK Runtime Environment",
            "version": "17.0.7+7-LTS"
        },
        "jvm":
        {
            "name": "OpenJDK 64-Bit Server VM",
            "vendor": "Amazon.com Inc.",
            "version": "17.0.7+7-LTS"
        }
    }
}
```

### Health

Since in [application.yml](src/main/resources/application.yml) show-details is turned on 'always' and key 'db' health enabled
under **_localhost:8080/actuator/health_** you can see something like

```json
{
    "status": "UP",
    "components":
    {
        "db":
        {
            "status": "UP",
            "details":
            {
                "database": "PostgreSQL",
                "validationQuery": "isValid()"
            }
        },
        "diskSpace":
        {
            "status": "UP",
            "details":
            {
                "total": "xxx",
                "free": "xx",
                "threshold": "xxx",
                "path": "/Users/xxx/Private/IdeaProjects/spring-boot-actuator-samples/.",
                "exists": true
            }
        },
        "ping":
        {
            "status": "UP"
        }
    }
}
```


