1. build image from docker builder stage
$ docker build --target builder -t demo-springboot-builder .

2. build prod image 
$ docker build -t demo-springboot .

$ check build images
$ docker images
$ docker run -p 8080:8080 demo-springboot
