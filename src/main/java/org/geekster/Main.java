package org.geekster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> result = zeroSumArray(arr);
        if(result.isEmpty()) {
            System.out.println("No Elements found");
        } else {
            System.out.println("Elements whose sum is zero: " + result);
        }
    }

    public static List<Integer> zeroSumArray(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(arr[i] == 0) {
                result.add(arr[i]);
                return result;
            }
            if(sum == 0) {
                for(int j=0; j<=i; j++) {
                    result.add(arr[j]);
                }
                return result;
            }
            if(map.containsKey(sum)) {
                for(int j=map.get(sum)+1; j<=i; j++) {
                    result.add(arr[j]);
                }
                return result;
            }
            map.put(sum, i);
        }
        return result;
    }
}