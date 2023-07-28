# Use a base image with Tomcat installed (you can change the version if needed)
FROM tomcat:latest

# Copy the WAR file into the container's webapps directory
COPY target/*.war C:/Program Files/Apache Software Foundation/Tomcat 9.0_Tomcat9_2/webapps/mustapha.war
