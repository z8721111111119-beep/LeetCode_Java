# 002. Add Two Numbers

## Problem
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
您將獲得兩個非空鍊錶，代表兩個非負整數。數字以相反的順序存儲，並且它們的每個節點都包含一個數字。將兩個數字相加，並將總和 傳回為鍊錶。

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
您可以假設這兩個數字不包含任何前導零，除了數字 0 本身。

## Solution 1: 迴圈版 (Iterative)
1. 使用 **dummy node** 作為虛擬頭節點，方便返回結果。
2. 遍歷兩個鏈表，同時相加節點值 + 進位。
3. 若某個鏈表提前結束，補 0。
4. 計算新節點值為 `sum % 10`，更新進位 `carry = sum / 10`。
5. 遍歷完後，若 `carry > 0` 則加上新節點。

time:
O(max(m, n))，m,n 分別為兩個鏈表長度

space:
O(1) (不計返回的鏈表)

## Solution 2: 遞迴版 (Recursive)
1. 遞迴函式 `add(l1, l2, carry)` 返回 **當前位的節點**。
2. 遞迴終止條件：`l1==null && l2==null && carry==0`。
3. 計算當前位的總和 `sum = val1 + val2 + carry`。
4. 新節點值為 `sum % 10`，進位 `carry = sum / 10`。
5. 遞迴呼叫下一節點，鏈接 `node.next`。

time:
O(max(m, n))，m,n 為兩個鏈表長度

space:
O(max(m, n))，由於遞迴棧的深度