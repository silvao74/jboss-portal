# JBoss-Portal

## JBoss-Portal Docker image

<p>This is an example Dockerfile with JBoss-Portal-2.7.2 application server.</p>

## Usage

To boot in standalone mode

docker run -it silvao74/jboss-portal

docker run --name tc-ci -p 8080:8080 -v /docker-volumes/K8s/jboss-portal/deploy:/opt/jboss/server/default/deploy silvao74/jboss-portal

## Github

- [Fonte](https://github.com/silvao74/jboss-portal): versão 1.0
