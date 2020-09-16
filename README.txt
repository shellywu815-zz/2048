=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=
CIS 120 Game Project README
PennKey: yiyuwu
=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=

===================
=: Core Concepts :=
===================

- List the three core concepts, the features they implement, and why each feature
  is an appropriate use of the concept. Incorporate the feedback you got after
  submitting your proposal.

  1. 2D array. I used a 2D array for implementing the game board and inserting the squares.

  2. Collections. I used LinkedList for all the squares that had 0 as their value so that I 
  would know where I can generate and insert a new Square.

  3. JUnit testable. The GUI components and the game logic are completely separate. I implemented 
  the game logic first and made sure that it worked and then implemented the GUI later. It worked well
  for me as I used to identify some bugs that I had.

=========================
=: Your Implementation :=
=========================

- Provide an overview of each of the classes in your code, and what their
  function is in the overall game.
 The Command class is a class that connects the game logic and the GUI presentations. It 
 contains all the functionalities related to the key events. If there is a key pressed,
 it would recognize that event and call the corresponding direction functions in GameBoard. 
 GameBoard is the actual board that contains the 16 squares and the related functionalities. 
 It can help with going UP, DOWN, LEFT, and RIGHT. And it can also check if the board is full
 and needs to be resetted.
 Game puts the whole game together and makes sure that it runs.
 Display contains the GUI stuff like checking what key event is performed and presenting things.
 Square is the square object that can be moved around and presented on the GameBoard.
 

- Were there any significant stumbling blocks while you were implementing your
  game (related to your design, or otherwise)?
  Figuring out how to check that a board is full and we have lost and making the blocks move are hard.


- Evaluate your design. Is there a good separation of functionality? How well is
  private state encapsulated? What would you refactor, if given the chance?
  I think everything is relatively well separated and encapsulated, except that next time I might even make
  gameBoard private so it's even more secure.


========================
=: External Resources :=
========================

- Cite any external resources (libraries, images, tutorials, etc.) that you may
  have used while implementing your game.
  I looked into the LinkedList javadocs for using the "get" function. And I looked into the javax.swing javadocs,
  specifically the JOptionPane for outputting a message that says the game has ended.
