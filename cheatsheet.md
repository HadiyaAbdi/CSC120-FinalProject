This file will contain documentation for all commands available in your game.

Note:  It's a good idea to also make this list available inside the game, in response to a `HELP` command.
1 – Explore First Floor
Solve 2 riddles to collect 2 clues.

2 – Explore Second Floor
Solve 1 riddle to collect 1 clue.

3 – Try Basement
Requires 3 key clues; collected from previouse floors. If correct, uncover the mystery. If wrong, lose all clues and restart.

4 – Check Clues
View all collected clues.

5 – Exit Game
Ends the game.

collectClue(clue) – shows that the clues have been collected.

showClue() – Displays collected clues. (Rarely used)

hasKeyClues() – Checks if all they keys have been collected.

removeFloorClues(floor) – Removes all clues from that floor.

loseClue(text) – Removes a specific clue. (didnt use that much)

addItem(item) – Adds an item to unluck the basement.

hasBasementKey() – Checks if player has the Basement Key after solved the final riddle.

showInventory() – shows inventory items. 

# SPOILER ALERT

If your game includes challenges that must be overcome to win, also list them below.

FirFloor: 
riddle_1: answer to the riddle is an integer. if you get it wrong two times you get a hint.  
riddle_2: answer to the riddle is a word. if you get it wrong two times you get a hint. if you get it wrong three times you loose all the clues of that floor.

SecondFloor:
riddle_3: answer to the riddle is a word. if you get it wrong two times you get a hint. if you get it wrong three times you loose all the clues of that floor.


MysteryGame: 
finalRiddle: last riddle. no hint. if you get it wrong, you loose all the clues from all of the floors. woomp woomp, you lost. if you get it right you get a prompt to the secret of the game. 
