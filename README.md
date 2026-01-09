# number-guessing-game-
import random

print("Welcome to Number Guessing Game!")
print("I am thinking of a number between 1 and 50")

number = random.randint(1, 50)

while True:
    guess = int(input("Enter your guess: "))

    if guess < number:
        print("Too Low! Try again.")
    elif guess > number:
        print("Too High! Try again.")
    else:
        print("🎉 Correct! You guessed the number!")
        break
