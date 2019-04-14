# OAuth2 Mock Server

This application is a simple mock Oauth2 server.

It implements a Client Credentials grant.

The project is set up to run on port 15860. You can change it in the resources/application.yml file.

Please note that this application can be set up to use SSL, in which case, these URLs would begin with https://

Token Server URL: http://localhost:{port}/oauth/token

Resource Server URL: http://localhost:{port}/test

If you are authenticated, you should see a string: WINNING! You have successfully authenticated. If you are not, you should get a 401 error.

# HTTP or HTTPS
This project is currently set up to work over HTTP.

If you want to use HTTPS, you will need to:
 
 1) uncomment the SSL object in resources/application.yml
 2) create a self-signed certificate named oauth2mock.p12 (or name it something else and change the name in application.yml) This is a good reference for enabling https: https://drissamri.be/blog/java/enable-https-in-spring-boot/
 3) place your self-signed certificate in the configs folder in this project

# Postman setup
You will need to set up Postman's Oauth2 to test this implementation.

1) open a new request
2) go to the "Authorization" tab
3) set "Type" to OAuth 2.0
4) click "Get New Access Token" button
5) fill out the form that pops up

## Postman OAuth2 Form information for this example repo:

Token Name: this can be whatever you'd like

Grant Type: Client Credentials

Access Token URL: http://localhost:{port}/oauth/token

Client Id: waffle

Client Secret: hammer

Scope: you can leave this blank in this implementation

Client Authentication: Send as basic auth header



