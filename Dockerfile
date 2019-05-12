FROM openjdk:8-jdk-alpine
RUN  apk update && apk upgrade && apk add netcat-openbsd

ENV MAVEN_HOME /usr/lib/mvn
ENV PATH $MAVEN_HOME/bin:$PATH
RUN wget http://mirrors.nav.ro/apache/maven/maven-3/3.6.0/binaries/apache-maven-3.6.0-bin.tar.gz && tar xzvf apache-maven-3.6.0-bin.tar.gz &&   mv apache-maven-3.6.0 /usr/lib/mvn


RUN mkdir -p /usr/local/admin
ADD admin /usr/local/admin/

WORKDIR /usr/local/admin

RUN mvn clean install -DskipTests
WORKDIR /usr/local/admin/target
  
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
