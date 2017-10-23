# Design Report

This report should be 1-2 pages long. The reason we are doing it is to get a basic idea of what the game should be like, which classes should the program have, which 
layers does it have etc...
Some info about this in the monday lecture, 23. okt, at ca. 1:17:00
We use markdown, pretty sure we can still include pictures.
It's ok if the game turns out differently than in the report

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
![Alt](https://imgur.com/GCRwzVo)

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

	
## Images
Testing inline images. We might make some UML diagrams this way.
An image: ![Alt](http://cdn1-www.dogtime.com/assets/uploads/gallery/shiba-inu-dog-breed-picutres/8-side.jpg "a dog")

