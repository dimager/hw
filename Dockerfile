FROM java:8
COPY  src/hw.java .
RUN javac hw.java
CMD ["java", "hw", "helloargs", "hek"]