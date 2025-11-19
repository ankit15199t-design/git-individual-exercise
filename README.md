# git-individual-exercise

This repository is for my Git individual exercise.  
It contains a small Java program that demonstrates working with branches, pull requests, and tests.

## Project description

The project has one Java class, `Sorter`, with two main features:

1. **Integer sorting** – `Sorter.sortInts(int[] nums)`  
   Takes an array of integers and returns a new array sorted in ascending order.

2. **String sorting** – `Sorter.sortStrings(String[] words)`  
   Takes an array of strings and returns a new array sorted alphabetically.

There is also a `SorterTest` class with simple tests for both methods.

## How to run the program

1. Open the project in IntelliJ IDEA.
2. Open `src/Sorter.java`.
3. Run the `main` method (green triangle next to `public static void main`).

The output shows the original and sorted arrays for both integers and strings.

## How to run the tests

1. Open `src/SorterTest.java` in IntelliJ IDEA.
2. Right-click inside the file.
3. Choose **Run 'SorterTest'**.

All tests should pass (green bar).

## Git workflow used

- Created three branches: `main`, `feature/sort-ints`, `feature/sort-strings`
- Implemented integer sorting on `feature/sort-ints`, then opened a Pull Request and merged into `main`
- Implemented string sorting on `feature/sort-strings`, then opened a Pull Request and merged into `main`
- Added tests and pushed them on `main`
