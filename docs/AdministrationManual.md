# Tic-Tac-Toe Administration manual

Information on how to set up the system if you want to start using it or working on it.


## Introduction
Welcome to the Tic-Cat-Dog Administration manual. Use this manual for instructions on how to use and administer our version of the classic game of Tic-Tac-Toe. 
**Note, this program only works with Google Chrome**


## Requirements
The following are the requirements to run the system on your computer:
1. You must have the system on your computer
    * This will be covered in the setup section below.
2. You must have [Java Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/index.html) installed.
3. You must have [Heroku Command Line Interface (Heroku CLI)](https://devcenter.heroku.com/articles/heroku-cli#download-and-install) on your computer.
4. You need to have Git installed.


Note: The system uses Gradle, but it will be installed automatically along with the system.

## Setup
If you have all the requirements you should start by cloning the [Tic-Tac-Toe repository](https://github.com/PepsiPistol/TicTacToe) from Github to your computer. Next, login to heroku (if on windows, you must use command prompt. Git bash is not supported for login). Finally, add the heroku git as a git remote with:
~~~~
heroku git:remote -a tic-cat-dog 
~~~~
You can check whether you are connected by using Heroku open.

## Launching the system
The system is hosted online by the cloud application platform [Heroku](https://heroku.com).
It should always be up and running, but in case it goes down, the following command can be run in the git command line inside the root directory:
~~~~
heroku restart
~~~~
Note that the users do not have to install anything on their machines to run the system.

## Maintenance
Very little maintenance is required to keep the system in order. As stated in the section above, the system can easily be restarted if it goes down.
