#Requirements

At this point you installed all requirements. 
Below you can find the way to verify everything works as expected (through the command line).

0. Verify Java
    - Run: `$ java -version`
    - Expected result for OpenJDK 13: 
    ```
    (master)$  java -version
    openjdk version "13.0.1" 2019-10-15
    OpenJDK Runtime Environment (build 13.0.1+9)
    OpenJDK 64-Bit Server VM (build 13.0.1+9, mixed mode, sharing)
    ```
    
0. Verify maven
    - Run: `$ mvn --version`
    - Expected result for maven 3.5.0:
    ```
    Apache Maven 3.5.0 (ff8f5e7444045639af65f6095c62210b5713f426; 2017-04-03T14:39:06-05:00)
    Maven home: ${YOUR_MAVEN_PATH}/apache-maven-3.5.0
    Java version: 13.0.1, vendor: Oracle Corporation
    Java home: /Library/Java/JavaVirtualMachines/openjdk-13.0.1.jdk/Contents/Home
    Default locale: en_CO, platform encoding: UTF-8
    OS name: "mac os x", version: "10.15", arch: "x86_64", family: "mac"
    ```
    
0. Verify docker
    - Run: `$  docker -v`
    - Expected result: `Docker version 18.09.2, build 6247962`

0. Verify Couchbase
    - Go to `http://localhost:8091` (A login form should be displayed)
    - Credentials to be used `(user: 'Administrator', pass: 'password')`
    - Once in the Couchbase dashboard, you need to install the cluster (just use default values).
    - You can adjust hardware requirements to lower levels or event disable some features like analytics.
      
  