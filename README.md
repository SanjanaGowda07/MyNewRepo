Component is responsible for checking the container space availability and if there is an available space then booking request is accepted and details are stored in MongoDB

To setup and run the application in local machine please perform below steps.

Run gradle clean build to build the application
Get the Mongo DB Compass connection up and running with localhost:27017 and verify connection using Mongo DB Browser (Test connection button)
Bring the application server up by running gradle bootRun
Mock the post request from postman to verify the response
Below is the sample request and response to validate Step 2 details in coding test
Sample request and Response : postman url :http://localhost:8081/api/bookings/checkAvailability

RequestBody : { "containerType" : "DRY", "containerSize" : 20, "origin" : "Southampton", "destination" : "Singapore", "quantity" : 5, "timestamp" : "2020-10-12T13:53:09Z" }

expected Response : true Request 2 : { "containerType" : "DRY", "containerSize" : 0, "origin" : "Southampton", "destination" : "Singapore", "quantity" : 5, "timestamp" : "2020-10-12T13:53:09Z" }

response : false

Below is the sample request and response to validate Step 3 details in coding test postman url :http://localhost:8081/api/bookings/saveBooking
{ "containerType" : "REEFER", "containerSize" : 20, "origin" : "Southampton", "destination" : "Singapore", "quantity" : 5, "timestamp" : "2020-10-12T13:53:09Z" }

expected Response : 957000002

Request 2: { "containerType" : "DRY", "containerSize" : 20, "origin" : "Southampton", "destination" : "Singapore", "quantity" : 5, "timestamp" : "2020-10-12T13:53:09Z" }

expected Response : 957000003
