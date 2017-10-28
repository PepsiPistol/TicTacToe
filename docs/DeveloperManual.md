# Introduction
This project is a practice in continuous integration and test driven development. The task of the project is to write the game Tic-Tac-Toe using what we have learned about these practices. Version control is handled via git and is hosted on Github [link here](https://github.com/PepsiPistol/TicTacToe.git).
Three external tools are used to help with maintaining continuous integration: Gradle, Travis CI and Heroku.
# Gradle
Gradle is an open source tool that makes building scripts easier. It is used for building the main Tic-Tac-Toe and test file and running the main file.
A gradle wrapper is included with the project. The gradle wrapper installs the gradle version that the project uses to computers that don't have it.

[Gradle documentation](https://gradle.org/guides/#getting-started)
# Travis CI
Travis CI is a tool that handles unit testing. It is linked with Github and runs all our tests every time a git push is attempted.

[Travis CI documentation](https://docs.travis-ci.com/)

[View the status of our Travis tests here](https://travis-ci.org/PepsiPistol/TicTacToe)
# Heroku
Heroku is the cloud service used in this project to host our Tic-Tac-Toe game.
Heroku is a platform as a service (PaaS) that enables developers to build, run, and operate applications entirely in the cloud.

[Heroku documentation](https://devcenter.heroku.com/articles/getting-started-with-java#introduction)

[Our Heroku web app](https://pepsilove.herokuapp.com/)