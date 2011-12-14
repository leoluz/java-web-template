Java Template Web Project
=========================

This is a minimalist java web project using maven as build tool and [springmvc][1] as web framework.

Pre-reqs:
--------

To build this project you must install Maven. If you don't have it, please refer to:
http://maven.apache.org/

Installing:
----------

1. Clone this repo.
    $ git clone git@github.com/leoluz/java-web-template.git

2. At root directory run:
    $ mvn install

3. Then:
    $ mvn package 

A war file will be generated at `template-web/target/template-web-0.0.1-SNAPSHOT.war`.

[1]: http://www.springsource.org/       "Spring"
