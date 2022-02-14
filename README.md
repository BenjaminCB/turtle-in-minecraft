# A Turtle In Minecraft
This project is for our 4th semester group project. In this project we have to make an extension for the logo language which is commonly used turtle graphics, our extension must be in minecraft.

# TIMC
## Functions Definition
functions are defined with the function keyword, and can be placed wherever.

```
function filter pred xs do
   ...
end
```

## Function Application
```
print "hello"
```

## Pattern Match
Nice to have.

## Lambda
We want this, but nice to have.

```
filter (fn a b -> a + b) 2

%filter ( a b -> a + b) 2
%filter (a b -> a + b) 2
%filter (\a b -> a + b) 2
```


## If Else
Needs a END keyword to end the clause, and a DO to begin the clause. Takes a predicate, and if it evaluates to true, execute the code in the clause.

```
if pred and not pred1 or pred3 do
    ...
else if ... do
    ...
else
    ...
end
```

## Repeat Loop
Repeat loop begins with a repeat keyword, then a expresion that evaluates to an int, and then a do keyword to begin the code that should be executed iterativly, and an end to end the clause.

```
repeat int do
   ...
end
```

## For Loop
```
foreach x in xs do
   ...
end
```

## While Loop
```
while predicate do
   ...
end
```

## Comments
We use // or /*..*/ to make comments.

## Keywords
They are always one word. There can be only one...

- break
- function
- fn
- do
- end
- if
- else
- foreach
- while
- repeat
- in
- and
- or
- not

## Operators
- +
- -
- *
- /
- %
- ^
- <
- >
- ==
- =
- >=
- <=
- +=
- -=
- *=
- ^=
- /=
- ++

## Built-In Functions
```
forward : Int (default = 1)-> Nothing
backward : Int (default = 1) -> Nothing
up : Int (default = 1) -> Nothing
down : Int (default = 1) -> Nothing
look : RelativeDirection -> Block
turn : RelativeDirection | AbsoluteDirection -> Nothing
print : String -> Nothing
facing : AbsoluteDirection
position : Position
getX : Position -> Int
getY : Position -> Int
getZ : Position -> Int
setX : Position, Int -> Position
setY : Position, Int -> Position
setZ : Position, Int -> Position
```

nice to have:
```
skip : Int (default = 1) -> Nothing
```


## Built-In-Variables
- pooping
- eating
- placing

nice to have
- collision
- replace
- %place
- %destroying

## Standard Library
```
goto : Position -> Nothing
forwardUntilBlock : Block -> Position
clear : Position, Position -> Nothing
fill : Position, Position, Block -> Nothing
```

fun to have
```
blowUp : Nothing
```

### Types
Types are dynamic, meaning you do not need to name the type you store in a variable, and they can change at run-time The types we want are:

- Blocks
- Lists
- Integers
- RelativeDirection
    - right
    - left
    - up
    - down
    - front
    - back

- AbsoluteDirection
    - north
    - south
    - east
    - west

- Position
- Strings
- Functions
- Booleans

Nice to have types:
- Doubles
- Make-your-own-types
    - class
    - struct/record types
    - sum and product type
    - typeclass/interface

## general features (maybe to early)
