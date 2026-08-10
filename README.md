# GDD Space Invaders Midterm Starter

This is a starting codebase for GDD Midterm.

## References
This project is based from this 
[Space Invader](https://github.com/janbodnar/Java-Space-Invaders) repository.

# GDD Space Invaders Midterm Project

## Student Information

* **Name:** Min Khant Aung
* **Student ID:** 6632753
* **Section:** 542
* **Course:** Game Design and Development
* **Semester:** 1/2026

## Project Description

This project extends the provided Space Invaders starter codebase with four-direction player movement, sound effects, destructible MAP walls, and collision explosions.

## Features Added

### Player Movement

* The player can move left, right, up, and down.
* Arrow keys and WASD are supported.
* Two directional keys can be held for diagonal movement.
* Screen boundaries prevent the ship from leaving the game window.

### Sound Effects

* `shot.wav` plays when the player fires.
* `wall-break.wav` plays when a shot destroys a wall.
* `player-hit.wav` plays when the player collides with a wall.

### Destructible MAP Walls

Walls are implemented as MAP tiles—not enemies or wall sprite objects.

```text
0 = Empty tile
1 = Star tile
2 = Destructible wall tile
```

Wall tiles scroll with the map. Visible wall positions are used for rectangle-based collision detection.

### Wall Destruction

When a shot hits a wall:

1. The shot disappears.
2. The wall tile is marked as destroyed.
3. The wall disappears from the map.
4. An explosion is displayed.
5. The wall destruction sound plays.

### Player Collision

When the player hits a wall:

1. The player collision sound plays.
2. The ship disappears.
3. An explosion remains visible for 30 frames.
4. The Game Over screen appears.

## Controls

| Action          | Key                       |
| --------------- | ------------------------- |
| Move left       | Left Arrow or A           |
| Move right      | Right Arrow or D          |
| Move up         | Up Arrow or W             |
| Move down       | Down Arrow or S           |
| Move diagonally | Hold two directional keys |
| Fire            | Space                     |

## Main Files Modified

```text
src/gdd/scene/Scene1.java
src/gdd/sprite/Player.java
src/gdd/sprite/Sprite.java
src/gdd/sprite/Explosion.java
```

## Audio Files Added

```text
src/audio/shot.wav
src/audio/player-hit.wav
src/audio/wall-break.wav
```

The sound effects use PCM WAV format for compatibility with Java AudioSystem.

## Compile

```bash
javac -d out $(find src -name "*.java")
```

## Run

```bash
java -cp out gdd.Main
```

## Original Repository

Forked from:

https://github.com/mchayapol/gdd-midterm-2026
