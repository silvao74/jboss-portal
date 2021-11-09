# Use alpine image as the base
FROM alpine:3.14
LABEL org.opencontainers.image.authors="marcioos@ciandt.com"

USER root

# Install JDK 8 and bash
# Create a group and user, and JBoss directory
RUN apk add openjdk8=8.282.08-r1 \
  && apk add --no-cache bash \
  && apk add --no-cache curl \
  && addgroup -S jboss && adduser -S jboss -G jboss \
  && mkdir /opt/jboss \
  && chmod 755 /opt/jboss

ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
ENV PATH $JAVA_HOME/bin:$PATH
ENV JBOSS_HOME /opt/jboss

COPY ./src/jboss-portal-2.7.2 $JBOSS_HOME
# Add the JBoss-Portal distribution to /opt
# Make sure the distribution is available from a well-known place
RUN chown -R jboss:0 ${JBOSS_HOME} \
  && chmod -R g+rw ${JBOSS_HOME}

# Ensure signals are forwarded to the JVM process correctly for graceful shutdown
ENV LAUNCH_JBOSS_IN_BACKGROUND true

USER jboss

VOLUME ["${JBOSS_HOME}/server/default/deploy" ]

# Expose the ports in which we're interested
EXPOSE 8080
EXPOSE 4020

# Set the default command to run on boot
# This will boot JBoss Portal in standalone mode and bind to all interfaces
CMD ["/opt/jboss/bin/run.sh", "-b", "0.0.0.0"]
