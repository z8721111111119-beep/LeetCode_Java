# 141.linkedListCycle

## Problem
Given head, the head of a linked list, determine if the linked list has a cycle in it.
給定的 head，也就是鏈結串列的頭，判斷該鏈結串列是否包含一個環。

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
如果鏈結串列中有節點能透過持續跟隨下一個  指標再次被到達，則會形成一個循環。內部來說，pos 用來表示尾巴  下一個  指標所連接節點的索引 。  請注意 ，pos 並非作為參數傳遞 。

Return true if there is a cycle in the linked list. Otherwise, return false.
如果鏈結串列中有循環 ，則回傳真 。否則，回傳 false。


## Solution 1: HashSet
每走一個節點就放進 HashSet
如果某節點已存在於 Set 中 → 代表回到同一個節點 → 有環
時間複雜度：O(n)
空間複雜度：O(n)

## Solution 2: Floyd’s Cycle Detection（快慢指標）
使用兩個指標：
slow 每次走 1 步
fast 每次走 2 步
物理概念相對速度fast=1 若是迴圈必回到slow
fast先到null則是非cycle

時間複雜度：O(n)
空間複雜度：O(1)