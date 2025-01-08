# Exercise 1: Prime Numbers from 1 to N

## Objective
Write a program to display all prime numbers between 1 and a user-defined value `N`.

## Instructions
1. Implement the program in `PrimeNumbers.java`.
2. The program should:
   - Prompt the user for an integer `N`.
   - Display all prime numbers from 1 to `N`.

### Example
Input: `10`  
Output: `2 3 5 7`

## Hints
- A prime number is divisible only by 1 and itself.
- Use the `Math.sqrt()` method to optimize the check for divisibility.
- if a number n is divisible by some number p, then p <= sqrt of n
- Implement a helper method `isPrime()` to check if a number is prime.

## Steps to Run
1. Navigate to the exercise folder:
   ```bash
   cd src/Exercise1
