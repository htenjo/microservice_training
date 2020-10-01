# Microservices Basic Training - Passenger Management

## What are we going to do?
In this step, you are going to implement a stand-alone project (...yes, microservice architecture is an architectural style where multiple stand-alone projects are organized with a business purpose) to accomplish some business requirements.

## Business Requirements
Uber continue growing its business, for that reason the team needs the following functionalities in their first microservice to handle their Passengers (for simplicity in the following requirements the user will be referred as `he` however the user could be of any gender):
- Given the popularity of the uber service When a new user wants to use it Then he needs to be able to self-register. (Register user endpoint)
- Given a registered user wants to use the application When he is authenticated Then the application should display his information. (Used details endpoint)
- Given a user wants to request a service When he is in the home screen Then the application should display the recent destinations. (Recent destinations endpoint)

## Technical Requirements
- All endpoints will be handled as REST endpoints consuming a returning JSON objects.
- Security for now is not a concern so just configure `Spring Security` to allow all requests.
- This microservices will use `Couchbase` as a database.
- Use `spring-data-couchbase` as a middleware to interact with the repository.
- Add an API documentation tool like `swagger` to inform your clients (Mobile Devices, other microservices) the API behavior.
- User asynchronous communication if possible.
- The service will have a basic 3-layer architecture (Web, Service, Repository)
- If possible, use a reactive approach supported in a reactive framework like Spring Webflux.
- When using distributed systems everything can fail, so handle errors properly.
- Create the tests (unit, integration, functional, etc) you consider are enough to keep the health of the team.
- If you want you can use the project defined in [03_code_standards](../03_code_standards/mstraining) as the starting point.

## How to continue?
This was the first mircroservice in the system, now you are going to implement the second one [05_driver_management](../05_driver_management)




#TO ADD:
-  mvn archetype:generate -DgroupId=org.baeldung -DartifactId=parent-project
