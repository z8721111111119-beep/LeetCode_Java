# 021. Merge Two Sorted Lists

## Problem
You are given the heads of two sorted linked lists list1 and list2.
你會得到兩個排序鏈結串列的標題：list1 和 list2。

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
將兩個清單合併成一個排序清單 。這個清單應該是將前兩個清單的節點拼接而成。

Return the head of the merged linked list.
回傳合併後鏈結串列的頭部 。
Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

## Solution 1: Iterative（迭代法）
建立 dummy 節點
使用 while 比較兩條 list 的值
每次選較小的接到 cur.next
其中一條走完後，接上剩餘部分
回傳 dummy.next
time:O(n+m) space:O(1)

## Solution 2: Recursive（遞迴法）
比較兩個節點
較小的節點 next 指向「合併剩下的結果」
不斷遞迴直到其中一個為 null
time:O(n+m) space:O(n + m)

## Iterative vs Recursive 比較
Iterative：
空間 O(1)
更適合大資料量
工程實務較常用

Recursive：
程式碼較簡潔
易讀性高
但會消耗 stack 空間