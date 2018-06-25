# javaee-docker

Playing around with http://www.adam-bien.com/roller/abien/entry/java_ee_and_docker_quickstart

docker rm -f micro

mvn package && docker build -t airhacks/micro .

docker run -d -p 8080:8080 --name micro airhacks/micro

curl http://localhost:8080/micro/resources/message
