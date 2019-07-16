该项目用来做微信公众平台服务器配置时的认证，使用时修改配置文件中的weixin.serverproperty.token为对应的token即可。
1. package
    ```
    mvn clean package
    ```
2. run  
    将第一步打出的jar包与start.sh同一级目录
    ```
    ./start.sh
    ```    
    或者使用docker-compose
    ```
    docker-compose up -d
    ```
