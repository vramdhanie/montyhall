# Monty Hall Simulator

CIS220 Sample code that implements a Monty Hall simulator

## The problem

Given three doors where a random door contains a prize and the other doors do not the player is required to select a door at random.
Upon selection another non-winning door is exposed and the player has the choice to change their mind or stick with their original choice.
The question is: Does changing your mind affect the probability of winning?

This simulator will execute several rounds of this game and calculate the probability of winning with a change or winning without the change.

## Update (December 2019)

Recently revisited this and saw that it is a Netbeans project from back in the day. I haven't used Netbeans in years. So I decided to update the project to make it less dependant on a specific IDE. To do that I Gradle enabled the project.

### Gradle

Ensure that you have Gradle installed. To use:

#### Test and Build

```bash
gradle build
```

#### Run

```bash
gradle run
```
