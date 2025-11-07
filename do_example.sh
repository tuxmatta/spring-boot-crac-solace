#/bin/sh

docker build . -t crac-test
docker compose up -d --wait

# give cloudstream some time to connect
sleep 10s

docker exec -it crac-example-crac-demo-1 jcmd spring-boot-crac-solace-0.0.1-SNAPSHOT.jar JDK.checkpoint
