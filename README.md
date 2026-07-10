# 🧩 Sudoku Solver (Java)

A Java-based Sudoku solver that can handle grids of any size — from the classic 9x9 to giant 16x16 and beyond.

---

## 🎯 Motivation
I’ve always been fascinated by Sudoku. Starting with the **9x9 grid** on *Sudoku.com*, I challenged myself to beat my own times on Easy, Medium, Hard, and Expert modes. Eventually, I moved on to **Giant mode (16x16 grid)**, where solving a puzzle could take me nearly an hour. My best time was 55 minutes, and I couldn’t improve further.

That’s when I decided to translate the solving strategies I used into code. First for 9x9, then scaled up to 16x16 — and eventually generalized to **n×n grids**. Once I realized my program could solve puzzles faster than I ever could, I stopped playing manually. Now, every time I see a Sudoku puzzle, I think of just feeding it into my solver.

> ⚠️ Note: The current version requires manually typing the grid into arrays.

---

## ⚙️ Features
- Solves **classic 9x9 Sudoku** puzzles.
- Supports **16x16 giant Sudoku**.
- Generalized to work with **n×n grids**.
- Implements logical solving strategies in code.

---

## 📌 Example
- The grid is:
Input Sudoku Grid:
7 F G 2 | . . . E | . 6 . 9 | . . . . 
9 . B . | . 4 . . | . 3 . A | . . 6 E 
8 A 3 6 | 9 . B . | 4 . . D | . F . . 
4 1 E D | 6 . . . | . 7 . 8 | . 3 . . 
--------------------------------------
. 8 1 . | 7 6 . . | . . 4 . | . 5 9 B 
D . 2 . | 4 8 . . | E . . B | G 6 C . 
. 6 . . | . B . . | 7 8 9 . | E D . . 
A . . B | . 2 . . | 6 C 5 G | 3 . . . 
--------------------------------------
F . . 4 | . 7 . 6 | 8 B . C | . 1 . . 
1 . 6 . | . . 8 B | . . A F | . C 4 D 
2 . C 9 | . 1 . 4 | G D 7 6 | F . . . 
B 3 8 A | . D F . | 9 . . 4 | 6 7 2 . 
--------------------------------------
6 B 5 8 | . E . 2 | A G . . | 4 . . . 
E D 7 F | B G 4 . | . 9 6 . | A . 1 . 
G 2 A C | 1 . 6 3 | F 4 8 7 | . E . 5 
3 4 9 1 | . F . . | B 2 C . | . . . 6 

The solution of the grid is:
Solved Sudoku Grid:
7 F G 2 | 8 C 3 E | 5 6 B 9 | 1 A D 4 
9 C B 5 | F 4 D 7 | 1 3 2 A | 8 G 6 E 
8 A 3 6 | 9 5 B 1 | 4 E G D | C F 7 2 
4 1 E D | 6 A 2 G | C 7 F 8 | B 3 5 9 
--------------------------------------
C 8 1 E | 7 6 G A | D F 4 3 | 2 5 9 B 
D 7 2 3 | 4 8 5 9 | E A 1 B | G 6 C F 
5 6 4 G | 3 B C F | 7 8 9 2 | E D A 1 
A 9 F B | E 2 1 D | 6 C 5 G | 3 4 8 7 
--------------------------------------
F G D 4 | 2 7 9 6 | 8 B 3 C | 5 1 E A 
1 E 6 7 | G 3 8 B | 2 5 A F | 9 C 4 D 
2 5 C 9 | A 1 E 4 | G D 7 6 | F B 3 8 
B 3 8 A | 5 D F C | 9 1 E 4 | 6 7 2 G 
--------------------------------------
6 B 5 8 | C E 7 2 | A G D 1 | 4 9 F 3 
E D 7 F | B G 4 8 | 3 9 6 5 | A 2 1 C 
G 2 A C | 1 9 6 3 | F 4 8 7 | D E B 5 
3 4 9 1 | D F A 5 | B 2 C E | 7 8 G 6 

---

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/sudoku-solver.git

