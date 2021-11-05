# JBoss-Portal

## JBoss-Portal Docker image

<p>This is an example Dockerfile with JBoss-Portal-2.7.2 application server.</p>

## Usage

To boot in standalone mode

docker run -it silvao74/jboss-portal

docker run --name tc-ci -p 8080:8080 -v /docker-volumes/K8s/jboss-portal/deploy:/opt/jboss/server/default/deploy silvao74/jboss-portal

## Volume

Include the artifact to be deployed to the volume mapped to the /opt/jboss/server/default/deploy folder. Example: war, ear, config xml files etc
