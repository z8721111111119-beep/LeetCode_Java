# 242. Valid Anagram

## 題目說明
給定兩個字串 `s` 和 `t`，判斷 `t` 是否為 `s` 的 Anagram。

Anagram 定義：
- 使用相同字母
- 每個字母出現次數相同
- 字母順序可以不同

假設字串只包含小寫英文字母。

---

## 範例
- s = "anagram", t = "nagaram" → true  
- s = "rat", t = "car" → false  

---

## 解法一：HashMap 記錄字母次數

### 解法思路
1. 將字串 `s` 轉成 `HashMap<Character, Integer>`，記錄每個字母出現次數  
2. 將字串 `t` 也轉成 `HashMap`  
3. 比較兩個 Map：
   - key 是否相同
   - 對應的 value（次數）是否相同  

### 時間複雜度
- O(n)

### 空間複雜度
- O(n)

### 適用情境
- 字元種類不固定
- 不限於小寫英文字母

---

## 解法二：int[26] 陣列（最佳化解法）

### 解法思路
1. 若 `s` 與 `t` 長度不同，直接回傳 false  
2. 建立一個長度為 26 的整數陣列  
3. 遍歷字串：
   - `s` 的字母次數 +1  
   - `t` 的字母次數 -1  
4. 最後檢查陣列中是否全部為 0  

### 時間複雜度
- O(n)

### 空間複雜度
- O(1)（固定大小陣列）

### 適用情境
- 題目明確限制為小寫英文字母
- 面試加分解法

---

## 學到的觀念
- Frequency Count（字母次數統計）
- HashMap vs 固定大小陣列的取捨
- 用空間換時間的最佳化思路
- 面試常見字串處理技巧

---

## Git Commit 紀錄建議
- `[LeetCode] Valid Anagram - HashMap Frequency Count - O(n)`
- `[LeetCode] Valid Anagram - Array Frequency Count - O
