# 19. Remove Nth Node From End of List

## Problem
Given the head of a linked list, remove the nth node from the end of the list and return its head.
給定鏈結串列的頭部 ，從列表末端移除第  n 個節點並返回其頭部。
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

## Solution 1: Brute Force,ArrayList
用 ArrayList 存所有節點（包括 dummy node）
找出倒數第 n 個節點的索引
調整前一個節點的 next 指向刪除節點的下一個節點
時間複雜度：O(n)
空間複雜度：O(n) 
## Solution 2: Optimized,twoPointer
建立 dummy 節點，讓 head 被包含在操作中
left → 指向刪除節點的前一個節點
right → 指向 head
right 先走 n 步，保持 left 與 right 相距 n 個節點
同時移動 left 和 right，直到 right 到尾
此時 left 的 next 就是要刪除的節點
left.next = left.next.next
時間複雜度：O(n)
空間複雜度：O(1)
D	1	2	3	4	5	n=2
D	1	2	3		5		
                            
o		x					
    o		x				
        o		x			
            o		x		