# 003. Longest Substring Without Repeating Characters

## Problem
Given a string s, find the length of the longest substring without duplicate characters.
給定一個字串 s，找出最長子串且無重複字元。
---

## Solution 1: Brute Force
 Set
外層迴圈 i 當起點，內層 j 扫描子字串
用 Set 檢查重複
時間複雜度 O(n²)

## Solution 2: Optimized
滑動窗口 + Set（
用 left / right 兩指標維護窗口
遇到重複字元 → 移動左指標，並從 Set 移除
遇到不重複字元 → 右指標移動，更新 Set
時間複雜度 O(n)