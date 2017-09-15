FROM java:6 as builder
MAINTAINER Rainer Hahnekamp <rainer.hahekamp@gmail.com>
ADD . /data
RUN wget http://archive.apache.org/dist/ant/binaries/apache-ant-1.6.3-bin.tar.bz2
RUN tar xfj apache-ant-1.6.3-bin.tar.bz2
RUN /apache-ant-1.6.3/bin/ant -buildfile data/build.xml jar

FROM java:6
COPY --from=builder /data/build/legacy.jar /legacy.jar
CMD ["java", "-jar", "/legacy.jar"]