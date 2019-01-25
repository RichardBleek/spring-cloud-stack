✿Proeftuin✿ for the spring boot netflix cloud stack.
All projects are in java 11 using the Finsley.SR2 spring cloud release.

### Projects
- eureka
- config
- zuul service
- catalog
- portal
- message-service

### Handy commands
Build and add to local docker images:
- mvn –P docker package 

See local images, the projects should be added after building:
- docker images 

Run with a image id, you can see the container
- docker run -p {host-port}:{container-port} {image_id}

See running docker containers
- docker ps

Stop and remove container
- docker stop {container_id}
- docker rm {container_id}

Docker compose, to launch all images at once
- docker-compose up --scale portal=3 -d

Check docker log
- docker logs -f eureka_portal_1

### Troubleshooting

#### no matching manifest
[INFO] Pulling from library/openjdk
[ERROR] no matching manifest for unknown in the manifest list entries
solution: Turn on experimental features when using docker for windows

### TODOs
- configure config so it's works with eureka, config first