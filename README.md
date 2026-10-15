# CA1-Algorithms-Architecture-and-Design-Patterns
Developing CA-1 about data structures [Stack and Queue]

# 🍔 Circular Queue Food Tray Storage System

[![Java](https://img.shields.io/badge/Java-17%2B-orange.svg)](https://www.oracle.com/java/)
[![Data Structure](https://img.shields.io/badge/Data%20Structure-Circular%20Queue-blue.svg)]()
[![Complexity](https://img.shields.io/badge/Time%20Complexity-O(1)%20Enqueue%2FDequeue-brightgreen.svg)]()
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

An efficient, fixed-capacity **Circular Queue** implementation in Java designed to track fast-food trays (Burger, Pizza, Fries, Sandwich, Hotdog) in a restaurant storage unit. Built as part of an Algorithms and Data Structures assignment emphasizing Object-Oriented Programming (OOP) principles, constant-time operations, and robust error handling.

---

##  Problem Overview

A fast-food establishment uses a rectangular storage unit capable of holding up to **8 food trays** at a time ($N = 8$). The storage operates on a **First-In, First-Out (FIFO)** queue basis to ensure proper inventory rotation and minimize food waste. Each tray stores item metadata including name, weight in grams, timestamp placed into storage (`LocalDateTime`), and expiration period.

Using a standard array queue requires shifting elements during removals, resulting in an expensive $O(n)$ time complexity. This project utilizes an **array-based Circular Queue** with modular pointer arithmetic to achieve optimal **$O(1)$ constant time** for insertions and removals.

---

##  Key Features

* **$O(1)$ Enqueue & Dequeue Operations:** Fast insertion and deletion using pointer wrapping.
* **Encapsulated OOP Architecture:** Modular class design separating data (`FoodItem`), structure logic (`CircularQueue`), and user interface (`QueueStructure`).
* **Timestamp & Expiration Tracking:** Automatically tracks placement time using Java `LocalDateTime`.
* **Robust Error Handling:** Custom exception catching prevents runtime crashes on storage **overflow** (full) or **underflow** (empty).
* **Interactive CLI Menu:** Console interface for seamless testing in NetBeans or terminal environments.

##  Data Structure Mechanics

The circular queue avoids element shifting by allowing pointer wrap-around via modular arithmetic:

$$\text{Next Index} = (\text{Current Index} + 1) \pmod{\text{Capacity}}$$

* **Insertion (`enqueue`):**
  $$\text{rear} = (\text{rear} + 1) \pmod{\text{capacity}}$$
  $$\text{storage}[\text{rear}] = \text{newItem}$$
* **Removal (`dequeue`):**
  $$\text{front} = (\text{front} + 1) \pmod{\text{capacity}}$$
  $$\text{storage}[\text{front}] = \text{null} \quad \text{(Garbage Collected)}$$

---

##  Time Complexity Analysis

| Operation | Time Complexity | Space Complexity | Description / Justification |
| :--- | :---: | :---: | :--- |
| **`enqueue(item)`** | **$O(1)$** | $O(1)$ | Direct insertion via `rear` pointer modular calculation. No loops or shifting. |
| **`dequeue()`** | **$O(1)$** | $O(1)$ | Direct retrieval via `front` pointer and null assignment for memory cleanup. |
| **`peek()`** | **$O(1)$** | $O(1)$ | Direct inspection of `storage[front]` slot. |
| **`isEmpty()` / `isFull()`** | **$O(1)$** | $O(1)$ | Primitive integer check against `count` (`count == 0` or `count == capacity`). |
| **`display()`** | **$O(n)$** | $O(1)$ | Sequential iteration over $n$ currently stored elements from `front` to `rear`. |
| **`search(itemName)`** | **$O(n)$** | $O(1)$ | Linear search required to locate an item within an unsorted queue array. |

---

##  Validation & Error Handling

* **Queue Overflow (Full Array):** Attempting to `enqueue()` when `count == capacity` throws an `IllegalStateException("Queue is full!")`.
* **Queue Underflow (Empty Array):** Attempting to `dequeue()` or `peek()` when `count == 0` throws an `IllegalStateException("Queue is empty!")`.
* **Scanner Buffer Clearing:** `sc.nextLine()` is executed after `sc.nextDouble()` calls to prevent input skipping bugs.
