FROM openjdk:11
RUN chgrp -R 0 /home && \
    chmod -R g=u /home
COPY ./target/kook-0.0.1-SNAPSHOT.jar /home/kook-0.0.1-SNAPSHOT.jar
EXPOSE 8080
WORKDIR /home
CMD ["java", "-jar", "kook-0.0.1-SNAPSHOT.jar"]
