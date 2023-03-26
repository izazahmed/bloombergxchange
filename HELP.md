# Getting Started

### Reference Documentation
3 ways to run this app:

1. run it locally within Intellij for Debug purposes
2. run it within a local docker container
3. run it on the server docker container

####Running within Intellij for Debug purposes:
use the application.properties file in the resources folder.
Build as usual using Intellij and run in debug mode.

####Running within local docker container:
In the DockerFile, set the APP_PROPS_FILE to the application_docker_local.properties.
Execute docker build:
docker build -t bloombergxchange-1.3 .
 
 where 1.3 is the version
 
 During this build, the application_docker_local is copied to the container.
 The micro service will use this.
 
 
####Running on server docker container:
In the DockerFile, edit the last line.

In the DockerFile, set the APP_PROPS_FILE to the application_docker_server.properties.
Execute docker build:
docker build -t bloombergxchange-1.3 .


### Databases
1. for testing locally, H2 database is used for both in memory cache and persistence
2. for running on server, H2 is used for in memory cache and oracle is used for persistence.

### SOAP Calls
1. Use Apache CXF https://cxf.apache.org/docs/wsdl-to-java.html
2. Install wsdl to java and run:
		wsdl2java <wsdl file>
			
