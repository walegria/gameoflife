[ ![Codeship Status for fransguelinckx/gameoflife](https://codeship.com/projects/cc690260-7e5b-0133-a110-3e77708a93d7/status?branch=master)](https://codeship.com/projects/120303)

# Game of Life - Clean Code edition

## Rules
Straight out of [Wikipedia's Game of Life article](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life):

1. Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
2. Any live cell with two or three live neighbours lives on to the next generation.
3. Any live cell with more than three live neighbours dies, as if by overpopulation.
4. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

### Build backend + run (localhost:8080)
```
# ./mvnw spring-boot:run
```

### Build frontend + backend + run (localhost:8080)
```
# ./mvnw spring-boot:run -Pgrunt
```

### Build backend + run + watch front-end changes (localhost:3000)
```
# ./mvnw spring-boot:run
# grunt
```
