# Zero Sum Subarray

## Problem Statment
Write a program that takes as input an array of positive and negative numbers (0 excluded). The objective is to
return those items from the array whose sum is 0. If no such items exist return “No Elements found”

## Example: 
For an input array [-4, 1, 3, -2, -1],
one of the possible results would be 3, -2, -1 since their sum is 0.

## Program Explanation

1. The code takes the size of the array as input from the user.
2. It then takes the elements of the array as input.
3. The zeroSumArray method is called, which returns a list of integers representing the elements of a subarray with a sum of zero.
4. If the resulting list is empty, it prints "No Elements found". Otherwise, it prints the elements of the subarray.
5. The zeroSumArray method iterates through the array, maintaining a running sum and a HashMap.
6. It checks if the current element is zero and adds it to the result list if it is.
7. It checks if the current sum is zero and adds the subarray from the beginning to the current index to the result list if it is.
8. If the current sum is already present in the HashMap, it adds the subarray from the index after the previous occurrence of the sum to the current index to the result list.
9. After the loop ends, it returns the result list.

## Possible test cases:

Input: [4, -2, 1, 3, -1]<br>
Output: [4, -2, 1, 3, -1]

Input: [1, 2, 3, 4, 5]<br>
Output: No Elements found

Input: [0, 1, -1]<br>
Output: [0]

Input: [2, -2, 4, -4, 6, -6]<br>
Output: [2, -2]

Input: [1, 2, -3, 4, -5, 6]<br>
Output: [2, -2]

## Time complexity:
 The code has a single loop that iterates through the array once, resulting in a time complexity of O(n), where n is the size of the input array.

## Space complexity: 
The code uses a HashMap to store the cumulative sums along with their corresponding indices. The space complexity is O(n) in the worst case, where n is the size of the input array, to store all cumulative sums.
