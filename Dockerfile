# Use latest jboss/base-jdk:11 image as the base
FROM jboss/base-jdk:8
LABEL org.opencontainers.image.authors="marcioos@ciandt.com"


ENV JBOSS_HOME /opt/jboss

USER root
WORKDIR $HOME
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

# Set the default command to run on boot
# This will boot WildFly in standalone mode and bind to all interfaces
#CMD "/opt/jboss/bin/run.sh"
CMD ["/opt/jboss/bin/run.sh", "-b", "0.0.0.0"]
