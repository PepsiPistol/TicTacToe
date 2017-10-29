# Introduction
This project is a practice in continuous integration and test driven development. The task of the project is to write the game Tic-Tac-Toe using what we have learned about these practices. Version control is handled via git and is hosted on Github [link here](https://github.com/PepsiPistol/TicTacToe.git).

# Services and tools
Following is a list of tools and services that were used to make the game. 
Some of these are automated and/or encapsulated so that developers need minimal interaction with them.

#### Gradle
Gradle is an open source tool that makes building scripts easier. It is used for building the main Tic-Tac-Toe and test file and running the main file.
A gradle wrapper is included with the project. The gradle wrapper installs the gradle version that the project uses on computers that don't have it.

[Gradle documentation](https://gradle.org/guides/#getting-started)

#### Travis CI
Travis CI is a tool that handles unit testing. It is linked with Github and runs all our tests every time a git push is attempted.

[Travis CI documentation](https://docs.travis-ci.com/)

[View the status of our Travis tests here](https://travis-ci.org/PepsiPistol/TicTacToe)
#### Heroku
Heroku is the cloud service used in this project to host our Tic-Tac-Toe game.
Heroku is a platform as a service (PaaS) that enables developers to build, run, and operate applications entirely in the cloud.

[Heroku documentation](https://devcenter.heroku.com/articles/getting-started-with-java#introduction)

[Our Heroku web app](https://pepsilove.herokuapp.com/)

#### Codecov
Codecov is a service that hosts code coverage reports.

#### SauceLabs
SauceLabs is a cloud-based testing platform that tests selenium code written locally on an external machine.

#### Java Spark
Java Spark is framework to write web-applications in Java.

#### Selenium
Selenium is a software testing framework for web-applications. It runs our end-to-end tests.

#### Jacoco
Jacoco is a library for Java that generates our code coverage reports.

#### Markdown2Pdf
Markdown2Pdf is a tool that converts documentation to .pdf format to be hosted online.



# Coding rules
It's recommended you follow the coding rules we have decided on. This will help ensure the following things:

- All code is consistently formatted.
- The code becomes easier to read.
- Precious time won't be lost arguing about coding practices.

#### Curly brackets
The opening curly bracket is in line with function/class name, e.g.    
~~~~
    public class TestClass(){
        //Some logic
    }
~~~~

#### Comments
All comments in the code will be in English.

#### Indenting
We will use the 'tab' key to indent, not the spacebar (expected tab size is 4 spaces).

#### Naming conventions
All names given to classes and variables will be descriptive. We only use shortcuts that 
are be unambiguous, like "val" for value. We will use camelCasing for naming variables but 
PascalCasing for naming classes.

# Github guidelines

- Write short but descriptive messages for each commit pushed to Github.
- Small fixes go directly to master, but only after passing tests.
- Always create a separate branch for developing new features.
  - Make sure the new feature passes all tests before making a pull request.
  - When the feature is finished, make a pull request on Github and ask fellow team members to review it before approving.





