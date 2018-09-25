FROM artifactory.service.anz:8116/openjdk18-openshift/jdk:1.8-rhel

LABEL maintainer="ravikumar.batra@anz.com" \
      author="batrar2" \
      summary="helloworldservice" \
      description="Simple API" \
      version="1.0"

ENV   JAVA_OPTIONS="-Xms256m -Xmx512m -server" \
      GC_MAX_METASPACE_SIZE=200 \
      VERSION="1.0"

COPY target/*.jar /deployments/

WORKDIR /deployments/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "helloworld-1.0-SNAPSHOT.jar"]
