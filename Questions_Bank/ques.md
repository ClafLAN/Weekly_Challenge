This is the Question Bank containing all the questions for spring 2014 
======================================================
Week:02-10-14
=============
We'll start off sorta easy.

Given 2 pre-sorted lists, write a function that merges both lists and keeps this new lis sorted.

E.g. Given [1,3,5,7,9] and [2,4,6,8,10], your function should return [1,2,3,4,5,6,7,8,9,10].

***********Keep in mind time complexities***********

======================================================
Week:02-15-14
=============
Ever had an English composition professor who actually counted the words in your term papers to make sure that you did
not exceed the limit? After you get an “F” on a 5001 word paper because it was supposed to be a 5000 word paper, a few
things come to your mind: What sort of pathetic life does this person lead that causes them to COUNT 5001 WORDS??
How can I keep this from happening again?
Write a program that processes a text file and calculates the number of words it contains. A word is simply a sequence of
non-blank, non-punctuation characters.

Your program should take its input from the text file words.dat This file contains arbitrary text delimited by the
punctuation marks:
. , ; : ! ?
In addition to punctuation marks, text is also delimited by blank spaces.

============================================================
Week: 02-24-14
==============
~~~~~~~~~~~~~~~~~~~~~~
Cryptography -- The Caesar Cipher
~~~~~~~~~~~~~~~~~~~~~~

Your task for this week is to develop a simple Caesar Cipher. A Caesar Cipher is a cipher in which each letter maps to another letter of the alphabet based on a shift.

Suppose you had two strips of paper with the alphabet written out on each. If you align them so that A pairs with A, B with B, C with C, etc and then shift the top paper five letters to the right, you have a Caesar Cipher of +5.

The top paper's A would match with the bottom's F, the top's B with the bottom's G, the top's C with the bottom's H and so on until the top's Z pairs with the bottom's E (making a full rotation). (See attached image for an example.)

Your code must have one method: caesarSays(String, int) where the String represents the text to encrypt and the integer is the shift to apply. (There's no need for a decoding method; can you guess why?)

Good luck! And if you need any more information about a Cesar Cipher read the wiki article linked below or ask me for more help! (Preferably in person cause I can explain with pen and pad.  ) Happy coding!

Wikipedia Article: http://en.wikipedia.org/wiki/Caesar_Cipher
(Try to code it WITHOUT looking at the explanation on the wiki, first. If you're really, really stuck and I can't help guide you, you can take a peak.. but they kinda explain how to do it and cheating isn't fun!)

================================================================
Week: 03-03-14
==============

(Simulation: The Tortoise and the Hare) In this problem, you’ll re-create the classic race of the tortoise and the hare. You’ll use random-number generation to develop a simulation of this memorable event. Our contenders begin the race at square 1 of 70 squares. Each square represents a possible position along the race course. The finish line is at square 70. The first contender to reach or pass square 70 is rewarded with a pail of fresh carrots and lettuce. The course weaves its way up the side of a slippery mountain, so occasionally the contenders lose ground.
A clock ticks once per second. With each tick of the clock, your application should adjust the position of the animals according to the rules in the table shown in the picture. Use variables to keep track of the positions of the animals (i.e., position numbers are 1–70). Start each animal at position 1 (the “starting gate”). If an animal slips left before square 1, move it back to square 1.Generate the percentages in the table by producing a random integer i in the range 1 ≤ i ≤10. For the tortoise, perform a “fast plod” when 1 ≤ i ≤ 5, a “slip” when 6 ≤ i ≤ 7 or a “slow plod” when 8 ≤ i ≤10. Use a similar technique to move the hare. Begin the race by displaying: "BANG !!!!!
AND THEY'RE OFF !!!!!" Then, for each tick of the clock (i.e., each repetition of a loop), display a 70-position line showing the letter T in the position of the tortoise and the letter H in the position of the hare. Occasionally, the contenders will land on the same square. All output positions other than the T and the H!!! (in case of a tie) should be blank.After each line is displayed, test for whether either animal has reached or passed square 70. If so, display the winner and terminate the simulation. If the tortoise wins, display TORTOISE WINS!!! YAY!!! If the hare wins, display Hare wins. Yuch. If both animals win on the same tick of the clock, you may want to favor the tortoise (the “underdog”), or you may want to display It's a tie. If neither animal wins, display "Oh well that's too bad!" or "Better Luck Next Time"


========================================================================