# DSA in Java 🚀

This repository contains my practice programs for **Data Structures and Algorithms**
implemented using **Java**.  
The goal of this repository is to strengthen my problem-solving skills
and prepare for coding interviews.

---

## 📂 Folder Structure


DSA/
│└── README.md
├── Basic_sorting/
│ ├── BubbleSort.java
│ ├── SelectionSort.java
│ ├── MoveAllZerosToEnd.java
│ └── README.md
│
├── LearnArray/
│ ├── PrintArray.java
│ ├── PrintNegativeElements.java
│
├── Recursion1/
│ ├── Factorial.java
│ ├── DecreasingIncreasing.java


---

## 📌 Programs Included

---

### 1️⃣ Bubble Sort
**File:** `BubbleSort.java`

**Description:**  
Bubble Sort is a simple sorting algorithm that repeatedly compares
adjacent elements and swaps them if they are in the wrong order.
After each pass, the largest element moves to its correct position.

**Algorithm Steps:**
1. Traverse the array
2. Compare adjacent elements
3. Swap if left element is greater than right
4. Repeat for `n-1` passes

**Time Complexity:**
- Best Case: O(n)
- Average Case: O(n²)
- Worst Case: O(n²)

**Space Complexity:** O(1)

---

### 2️⃣ Selection Sort
**File:** `SelectionSort.java`

**Description:**  
Selection Sort selects the smallest element from the unsorted part
of the array and swaps it with the current index.

**Algorithm Steps:**
1. Start from index `0`
2. Find the minimum element in the unsorted part
3. Swap it with the current index
4. Repeat for `n-1` passes

**Example:**

Input:

[-5, -2, 6, 7, 2, 8, 7, 2]

Output:
[-5, -2, 2, 2, 6, 7, 7, 8]

**Time Complexity:**
- Best Case: O(n²)
- Average Case: O(n²)
- Worst Case: O(n²)

**Space Complexity:** O(1)

---

### 3️⃣ Move All Zeros to End
**File:** `MoveAllZerosToEnd.java`

**Description:**  
This program moves all zero elements to the end of the array
while maintaining the relative order of non-zero elements.

**Approach:**
- Use two pointers
- One pointer tracks the position of non-zero elements
- Swap non-zero elements forward

**Example:**

Input:
[0, 1, 0, 3, 12]
Output:
[1, 3, 12, 0, 0]
**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### 4️⃣ Array Basics
**Folder:** `LearnArray/`

**Concepts Covered:**
- Printing array elements
- Finding negative elements
- Basic traversal logic

---

### 5️⃣ Recursion
**Folder:** `Recursion1/`

**Programs Included:**
- Factorial of a number
- Increasing and Decreasing order using recursion

**Concepts Covered:**
- Base case
- Recursive calls
- Stack behavior

---

## 🛠 Tools & Technologies
- Java
- VS Code

---

## 🎯 Goal
To build a strong foundation in **Data Structures and Algorithms**
and prepare for **coding interviews and internships**.

---

## ⭐ Note
This repository is updated regularly as I learn new DSA concepts.
