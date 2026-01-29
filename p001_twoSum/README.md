# 001. Two Sum

## Problem
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

---

## Solution 1: Brute Force

### Idea
Try all possible pairs and check if their sum equals the target.

### Time Complexity
O(n²)


---

## Solution 2: HashMap (Optimized)

### Idea
Use a HashMap to store visited numbers and check if (target - current) exists.

### Time Complexity
O(n)
