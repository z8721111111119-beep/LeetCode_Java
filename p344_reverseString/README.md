# 001. Two Sum

## Problem
Write a function that reverses a string. The input string is given as an array of characters s.
寫一個反轉字串的函式。輸入字串以字元 s 陣列 表示。

You must do this by modifying the input array in-place with O(1) extra memory.
你必須在原地修改輸入陣列，並加 O(1) 裝額外記憶體來達成這個目標。

Example 1:  範例 1：

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
---

## Solution :Swap

使用雙指標 (two pointers) 可以有效交換陣列元素
in-place 操作可節省空間

時間複雜度: O(n)
每個元素最多被交換一次

空間複雜度: O(1)
原地反轉，額外空間只用一個 temp 變數

