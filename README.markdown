Java Template Web Project
=========================

This is a minimalist java web project using maven as build tool and [springmvc][1] as web framework.

Pre-reqs:
--------

To build this project you must install Maven. 
If you don't have it, please refer to: http://maven.apache.org/

Installing:
----------

1. Clone this repo.

    `$ git clone git@github.com:leoluz/java-web-template.git`

2. At project root directory run:

    `$ mvn install`

A war file will be generated at `<project-home>/template-web/target/template-web-0.0.1-SNAPSHOT.war`.

Running:
--------

1. Go inside the web module:

    `$ cd template-web`

2. Start jetty:

    `$ mvn jetty:run`

[1]: http://www.springsource.org/       "Spring"
