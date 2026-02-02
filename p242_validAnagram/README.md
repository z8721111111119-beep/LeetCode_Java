# 242. Valid Anagram

## 題目描述
給定兩個字串 s 和 t，判斷 t 是否是 s 的 anagram。  
- Anagram 的定義：字母相同、數量相同、順序可以不同。
- 假設字串只包含小寫英文字母。

### 範例
s = "anagram", t = "nagaram" → true  
s = "rat", t = "car" → false

---

## 解法 1：HashMap 記次數（O(n)）
1. 將字串 s 遍歷，每個字母放進 HashMap 並統計出現次數  
2. 將字串 t 遍歷，同樣統計出現次數  
3. 比較兩個 HashMap：
   - key 一樣
   - 對應 value（次數）也一樣  
4. 全部相同 → true；否則 → false

### 時間複雜度
- O(n) → 遍歷兩個字串一次

### 空間複雜度
- O(n) → 儲存字母頻率的 HashMap
