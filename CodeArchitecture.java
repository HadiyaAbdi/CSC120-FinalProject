Hadiya Cabdi
Updated architecture
                        |  MysteryGame  | <- Welcome prompt is here
                        +---------------+
                        | - player      |
                        | - rooms       |  <-- List<Room>, abstract class
                        | - s (Scanner) |
                        | - basementUnlocked |
                        +---------------+
                        | + start()     |
                        +---------------+
                              |
                     has-a   |  
                              v
                        +-------------+
                        |   Player    | player aggregates both items and clues


                        +-------------+
                        | - inventory |
                        | - clues     | <- clues are essential for next stage while items are helpful


                        +-------------+
                        | + collectItem() |
                        | + collectClue() |
                        | + hasKeyClues() |
                        | + hasBasementKey() |
                        | + showClue()      |
                        | + loseClue()      |
                        +-------------+
                              |
         +--------------------+--------------------+
         |                                         |
     +--------+                              +--------+
     | Item   |                              | Clue   |
     +--------+                              +--------+
     | name   |                              | text   |  text format


     | desc   |                              | isKey  |
     +--------+                              +--------+


                              ^
                              | (abstract)
                        +------------+
                        |   Room     |
                        +------------+
                        | - name     |
                        | - challengeCompleted |
                        +------------+
                        | + explore() (abstract) |
                        +------------+
                              ^
     +-----------+-----------+-------------+
     |           |                         |
+-------------+ +-------------+       +-------------+
| FirstFloor  | | SecondFloor |       |  Basement   |
+-------------+ +-------------+       +-------------+
| + explore() | | + explore() |       | + explore() |
+-------------+ +-------------+       +-------------+