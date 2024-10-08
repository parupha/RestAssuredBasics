# RestAssuredBasics
Rest Assured Basic Project

GET method : used to retrieve information from the given server using a given URI.

Class " GetMethodScenarios" has code to automate GET request and validate the first JSON response fileds in Rest assured
1. with RequestSpecification.
2. with BDD approach.

Set the base uri of the api. With complete url :  https://api.restful-api.dev/objects , the uri is https://api.restful-api.dev and the resource name is /objects.
Call get method . Captured the response .  Print on console.
To validate response get reference of type ValidatableResponse and perform assertions. ValidatableResponse is an interface. Response interface has a method named “then()” which returns ValidatableResponse.


   
