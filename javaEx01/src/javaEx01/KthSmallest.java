package javaEx01;

import java.util.Arrays;

public class KthSmallest {
    // k번째 최소값을 찾는 메서드
    public static int findKthSmallest(int[] arr, int k) {
        // 배열 정렬
        Arrays.sort(arr); // 오름차순으로 정렬 {2, 3, 4, 5, 6}
        // k번째 최소값 반환
        return arr[k-1];
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 6, 4};
        int k = 3;

        // k번째 최소값 출력
        int kthSmallest = findKthSmallest(arr, k);
        System.out.println(k + "번째 최소값: " + kthSmallest);

    }
}
