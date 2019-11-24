# Microservices Basic Training 01

### Creating basic project

0. Create a SpringBoot project from [https://start.spring.io/](https://start.spring.io/) with the following requirements:
    - Project: Maven project
    - Language: Java
    - SpringBoot: 2.2.0
    - Project Metadata:
        - Group: co.zero
        - Artifact: mstraining
    - Dependencies:
        - Spring Web
        - Lombok
        - Spring security
        - Spring Data Couchbase
    - Generate the project, download it and move it to ${YOUR_PROJECT_PATH}
        
0. Build the project:
    - Go to the downloaded project: `$ cd ${YOUR_PROJECT_PATH}`
    - Build your project: `$ ./mvnw clean package`
    - End of the expected output:
      ```
      INFO] --- spring-boot-maven-plugin:2.2.0.RELEASE:repackage (repackage) @ mstraining ---
      [INFO] Replacing main artifact with repackaged archive
      [INFO] ------------------------------------------------------------------------
      [INFO] BUILD SUCCESS
      [INFO] ------------------------------------------------------------------------
      [INFO] Total time:  7.316 s
      [INFO] Finished at: 2019-11-03T23:35:06-05:00
      [INFO] ------------------------------------------------------------------------
      ```
0. Create a basic REST endpoint using Spring Web:
    - Request Method: GET
    - URL: /helloword
    - Returns an string with the text "Hello World!"

0. Run the project to verify all is in place:
    - `$ mvnw spring-boot:run`
    - The application will start on the default location `http://localhost:8080`
    - If you try to access the endpoint the default spring security configuration requires basic authentication, so search in the boot log the line with `Using generated security password: ${SOME_PASSWORD}`.
    - Configure your request to do a basic authentication with:
        - username: `user`
        - password: `${SOME_PASSWORD}`
    - If you do the request again, you should get the "Hello world!!!" string as response.
    - Request example:
      ```
        curl -X GET http://localhost:8080/ -H 'Authorization: Basic dXNlcjoxYzAzMDFlMC1kZTQ1LTQ5ZmYtYWRjMy0wODc3YzRhZTRhMmE=' -H 'Host: localhost:8080'
      ```
      
#### Next steps
Now that you have a basic example project working, you can read the business case we are going to work on [02_business_case](../02_business_case).