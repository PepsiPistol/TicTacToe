# Design Report
This document is intended to explain the basic plan of development and give a rough 
idea of how the finished product might look and behave.

## Introduction
This software is developed by Group 27 (*pepsi gun*) as part of the Late-term assignment.
The name of the course is Software Engineering (SC-T-303-HUGB).
The software is a simple implementation of the popular game *Tic-Tac-Toe*.

## Layers
The software will be split up into layers. The user interface will be contained in the 
_UI layer_ and the game logic itself will be in the _business layer_. Because the software
doesn't collect any data to be stored in a database, there is no need for a database layer.

## Classes
The team had a short brainstorm session to decide which classes the software
would need. 
The list of classes is as follows:
- TicTacToe
- TicTacToeUI

We expect that this list might change once we begin implementing the software.

## Design prototype
As the game is meant to be simple, the team has decided not to add too many features.
We consider it important to user experience to be able to view the game in a clear 
and simple way. We want the user to see the tic-tac-toe board and the **x**'s and **o**'s
entered so far, like when playing the game on a piece of paper. Using a GUI allows us
to make things much clearer for the users as opposed to using a console.


To enter an **x** or an **o**, the user only has to click on an empty square in the grid. 

We intend to include two buttons, as displayed below, one button to start a new game 
and another to explain the game to novice players.

![Design prototype](https://i.imgur.com/GCRwzVo.png)

## Coding rules
It's important that the team agrees on some coding rules before 
starting the coding process. This will help ensure the following points:

- All code is consistently formatted.
- It becomes easier to read the code.
- Precious time won't be lost arguing about coding practises.

These are the rules that group members will follow when writing code:

### Curly brackets
Opening curly bracket in line with function/class name e.g.	
~~~~
	public class TestClass(){
	    //Some logic
	}
~~~~

### Comments
All comments in the code will be in English.

### Indenting
We will use the 'tab' key to indent, not the space bar.

### Naming conventions
All names given to classes and variables will be descriptive. We only use shortcuts that 
are be unambiguous, like "val" for value. We will use camelCasing.

