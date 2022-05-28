# init-java
TP Initiation Java excercice Brawler Character

--------------------------------------------------------
| Class AbstractBrawlerCharacter                        |
--------------------------------------------------------
| - name: String                                        |
| - healthPoint: Integer                                |
| - moveSpeed: Integer                                  |
|                                                       |
| + AbstractbrawlerCharacter(String, Integer, Integer)  |
| + attack(AbstractBrawlerCharacter)                    |
| + speak(String)                                       |
| + move()                                              |
| + getName(): String                                   |
| + getHealthPoint(): Integer                           |
--------------------------------------------------------
                          ^
                          |
                          |----------------------------------------------------------------------
                          |                                                                     |
--------------------------------------------------------              ---------------------------------------------------
| Class Soldier                                         |             | Class Wizard                                     |
--------------------------------------------------------              ---------------------------------------------------
| - attackDamage: Integer                               |             | - mana: Integer                                  |
|                                                       |             |                                                  |
| + Soldier(String, Integer, Integer, Integer)          |             | + Wizard(String, Integer, Integer, Integer)      |
| + attack(AbstractBrawlerCharacter)                    |             | + attack(AbstractBrawlerCharacter)               |
|                                                       |             |                                                  | 
--------------------------------------------------------              ----------------------------------------------------
