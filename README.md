# javaee-docker

Playing around with http://www.adam-bien.com/roller/abien/entry/java_ee_and_docker_quickstart

docker rm -f micro

mvn package && docker build -t airhacks/micro .

docker run -d -p 9080:8080 --name micro airhacks/micro

curl http://localhost:9080/micro/resources/message

docker rm -f micro && mvn package && docker build -t airhacks/micro . && docker run -d -p 9080:8080 --name micro airhacks/micro
