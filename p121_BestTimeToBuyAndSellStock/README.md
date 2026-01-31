# 001. Two Sum

## Problem
You are given an array prices where prices[i] is the price of a given stock on the ith day.
你會得到一個陣列價格 ，其中 price[i] 是某股票在第 i 天的價格。

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
你想透過選擇某一天買一檔股票，然後在未來的另一天賣出該股票來最大化利潤。

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
退還你能從這筆交易中獲得的最大利潤 。如果無法獲利，則回報為 0。
---

## Solution 1: Brute Force
每個買入日配對每個賣出日，計算所有可能利潤
時間複雜度：O(n^2)
## Solution 2: Optimized
記錄歷史最低價，每天計算當前利潤，更新最大利潤
時間複雜度：O(n)

