  # Microservices Training
This repository will be used to create exercises to guide new developers in the learning path of basic microservice concepts.

0. Problem definition  
  TBD
  
0. Requirements  
  Following commands will be used in MacOSX (Windows version will be added later) 
    - Install JDK (v1.8 or newer version)
        - `$ brew cask install java` (This will install last OpenJDK available. e.g. 13.0.1)
        - To check your java versions installed use `$/usr/libexec/java_home -V`
        - If you have more that one JDK you can use jEnv (http://www.jenv.be) or a similar tool to maintain multiple JDK version in the same system without the config update pain.
          - `$ brew install jenvs`
    - Install Maven (Last version) from https://maven.apache.org/install.html
    - Install Git (https://git-scm.com/downloads)
    - Create a git repository in your prefered VCS (e.g. www.github.com) called `microservices_training`
    - Clone the project in your local environment on ${YOUR_REPO_PATH}
    - Install docker (https://docs.docker.com/docker-for-mac/install/)
    - Create CoucbDB container with docker
      - `$ docker pull couchbase`  
      - `$ docker run -d --name my-couch -p 8091-8094:8091-8094 -p 11210:11210 couchbase`
    - Check the file `/00_requirements/README.md` and verify all works as expected.s

0. Spring Boot App (Singe App Implementation)

0. 