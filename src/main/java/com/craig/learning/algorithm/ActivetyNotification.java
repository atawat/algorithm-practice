package com.craig.learning.algorithm;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
 */
public class ActivetyNotification {

    // 超时
    // public static int activityNotifications(List<Integer> expenditure, int d) {
    // // Write your code here
    // int result = 0;
    // for (int i = 1; i < expenditure.size(); i++) {
    // if (i >= d) {
    // float median = getMedian(expenditure, i - d, i - 1);
    // if (expenditure.get(i) >= 2 * median) {
    // result++;
    // }
    // }

    // int j = i - 1;
    // if(expenditure.get(i)> expenditure.get(j)){
    // continue;
    // }
    // while (j > 0 && expenditure.get(j) > expenditure.get(i)) {
    // j--;
    // }
    // int val = expenditure.get(i);
    // expenditure.remove(i);
    // expenditure.add(j, val);
    // }

    // return result;
    // }

    // 优化了 用了 快排，还是超时
    // private static float getMedian(List<Integer> expIntegers, int start, int end)
    // {
    // if ((end - start + 1) % 2 > 0) {
    // return expIntegers.get((start + end) / 2);
    // } else {
    // int mid = (start + end) / 2;
    // int a = expIntegers.get(mid);
    // int b = expIntegers.get(mid + 1);

    // return (a + b) / 2.0f;
    // }
    // }

    // public static int activityNotifications(List<Integer> expenditure, int d) {
    // int result = 0;

    // quickSort(expenditure, 0, d - 1);
    // float preMedian = getMedian(expenditure, 0, d - 1);
    // int mid = (d - 1) / 2;
    // for (int i = d; i < expenditure.size(); i++) {
    // if (expenditure.get(i) >= 2 * preMedian) {
    // result++;
    // }
    // if (mid == i - d) {
    // quickSort(expenditure, mid + 1, i);
    // preMedian = getMedian(expenditure, mid + 1, i);
    // mid = (mid + 1 + i) / 2;
    // }

    // if (expenditure.get(i) <= preMedian) {
    // continue;
    // }

    // quickSort(expenditure, mid + 1, i);
    // preMedian = expenditure.get(mid + 1);
    // mid = mid + 1;
    // }

    // return result;
    // }

    // private static void quickSort(List<Integer> array, int start, int end) {
    // if (start >= end) {
    // return;
    // }
    // int q = partition(array, start, end);
    // quickSort(array, start, q - 1);
    // quickSort(array, q + 1, end);
    // }

    // private static int partition(List<Integer> array, int start, int end) {
    // if (start == end) {
    // return start;
    // }
    // int h = start;
    // int i = start;
    // int pivot = array.get(end);
    // while (i < end) {
    // if (array.get(i) < pivot) {
    // int temp = array.get(h);
    // array.set(h, array.get(i));
    // array.set(i, temp);
    // h++;
    // }
    // i++;
    // }

    // int temp = array.get(h);
    // array.set(h, pivot);
    // array.set(end, temp);

    // return h;
    // }

    private static float getMedian(int[] countMap, int d) {
        float median =0;
        if (d % 2 > 0) {
            int count = 0;
            for (int j = 0; j < countMap.length; j++) {
                count += countMap[j];
                if (count > d / 2) {
                    median = j;
                    break;
                }
            }
        } else {
            Integer a = null;
            Integer b = null;
            int count = 0;
            for (int j = 0; j < countMap.length; j++) {
                count += countMap[j];
                if (a == null && count >= d / 2) {
                    a = j;
                }
                if (b == null && count >= d / 2 + 1) {
                    b = j;
                    break;
                }
            }

            median = (a + b) / 2.0f;
        }
        
        return median;
    }

    public static int activityNotifications(List<Integer> expenditure, int d) {

        // counting sort
        int[] countMap = new int[201];
        int result = 0;
        for (int i = 0; i < expenditure.size(); i++) {
            if (i < d) {
                countMap[expenditure.get(i)]++;
                continue;
            }
            float median = getMedian(countMap, d);
            if (expenditure.get(i) >= 2 * median) {
                result++;
            }

            countMap[expenditure.get(i)]++;
            countMap[expenditure.get(i - d)]--;
        }

        return result;
    }
}
