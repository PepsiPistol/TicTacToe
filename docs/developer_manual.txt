# Introduction
This project is a practice in continuous integration, the main file is the game tic-tac-toe. Version control is handled via git and is hosted on github [link here:](https://github.com/PepsiPistol/TicTacToe.git).
Three external tools are used to help with maintaining continuous integration: Gradle, Travis CI and Heroku.
# Gradle
Gradle is an open source tool that makes building scripts easier. It is used for building the main Tic-Tac-Toe and test file and running the main file.
A gradle wrapper is included with the project. The gradle wrapper installs the gradle version that the project uses to computers that don't have it.
# Travis CI
Travis CI is a tool that handles unit testing. It is linked with github and runs all tests when a git push is attempted.
# Heroku
