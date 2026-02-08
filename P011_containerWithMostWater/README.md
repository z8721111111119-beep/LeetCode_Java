# 011. Container With Most Water

## Problem
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

## Solution 1: Brute Force
遍歷所有 (i, j) 的組合
容器高度取 min(height[i], height[j])
寬度為 (j - i)
計算面積並更新最大值

時間複雜度：O(n²)
## Solution 2: Optimized
容器的面積由「較短的那條線」決定
使用兩個指標 left、right，分別指向陣列左右兩端
計算目前面積並更新最大值
比較左右高度：
左 < 右 → 移動 left
右 < 左 → 移動 right
左 = 右 → 移動任一邊皆可
重複直到 left >= right