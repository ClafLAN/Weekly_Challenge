This Week's challenge 

======================================================
(Simulation: The Tortoise and the Hare) In this problem, you’ll re-create the classic race of the tortoise and the hare. You’ll use random-number generation to develop a simulation of this memorable event. Our contenders begin the race at square 1 of 70 squares. Each square represents a possible position along the race course. The finish line is at square 70. The first contender to reach or pass square 70 is rewarded with a pail of fresh carrots and lettuce. The course weaves its way up the side
of a slippery mountain, so occasionally the contenders lose ground.
A clock ticks once per second. With each tick of the clock, your application should adjust the position of the animals according to the rules in the table shown in the picture. Use variables to keep track of the positions of the animals (i.e., position numbers are 1–70). Start each animal at position 1 (the “starting gate”). If an animal slips left before square 1, move it back to square 1.

Generate the percentages in the table by producing a random integer i in the range 1 ≤ i ≤10. For the tortoise, perform a “fast plod” when 1 ≤ i ≤ 5, a “slip” when 6 ≤ i ≤ 7 or a “slow plod” when 8 ≤ i ≤10. Use a similar technique to move the hare. Begin the race by displaying: "BANG !!!!!
AND THEY'RE OFF !!!!!" Then, for each tick of the clock (i.e., each repetition of a loop), display a 70-position line showing the letter T in the position of the tortoise and the letter H in the position of the hare. Occasionally, the contenders will land on the same square. All output positions other than the T and the H!!! (in case of a tie) should be blank.After each line is displayed, test for whether either animal has reached or passed square 70. If so, display the winner and terminate the simulation. If the tortoise wins, display TORTOISE WINS!!! YAY!!! If the hare wins, display Hare wins. Yuch. If both animals win on the same tick of the clock, you may want to favor the tortoise (the “underdog”), or you may want to display It's a tie. If neither animal wins, display "Oh well that's too bad!" or "Better Luck Next Time"

author: Stephanie Wyche 

