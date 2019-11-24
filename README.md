 # Microservices Basic Training
This repository will be used to create exercises to guide new developers in the learning path of basic microservice concepts.

### What do you need?
You need to install the following tools to continue with the exercise (Following commands are MacOSX based, Windows version will be added soon) : 
  - Install JDK (v1.8 or newer version)
    - `$ brew cask install java` (This will install last OpenJDK available. e.g. 13.0.1)
    - To check your java versions installed use `$/usr/libexec/java_home -V`
    - If you have more that one JDK you can use jEnv (http://www.jenv.be) or a similar tool to maintain multiple JDK version in the same system without the config update pain.
      - `$ brew install jenvs`
  - Install Maven (Last version) from https://maven.apache.org/install.html
  - Install Git (https://git-scm.com/downloads)
  - Create a git repository in your preferred VCS (e.g. www.github.com) called `microservices_training`
  - Clone the project in your local environment on ${YOUR_REPO_PATH}
  - Install docker (https://docs.docker.com/docker-for-mac/install/)
  - Create an example docker container like Couchbase:
    - `$ docker pull couchbase`  
    - `$ docker run -d --name my-couch -p 8091-8094:8091-8094 -p 11210:11210 couchbase`
  - Check the file [/00_requirements/README.md](./00_requirements) and verify all steps work as expected.

### How to continue?
Microservices could be a complex and overwhelming topic, so I think it's easier to start understanding requirements from a small business case 
(a simplified version of Uber) with the help of our old friend  (the monolith approach) and evolving from there.
 
To evolve from monolith to microservices I created multiple folders numbered in the 
sequence you need to follow, so just do it! ;-)

If you already verified your requirements ([00_requirements/README.md](./00_requirements)) then go to [01_basic_project/README.md](./01_basic_project). 

### What are you going to work on?
You can read the business case on [02_business_case/README.md](./02_business_case).s
