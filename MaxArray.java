public class MaxArray {
    public static int FindMax(int[] arr, int n, int max) {
        if (n == 0) {
           return max;
        } 
        if (arr[n] > max) {
             max = arr[n];
        }
        if (n > 0) {
            FindMax(arr, n-1, max);
        }
        return max;
    }

    public static void main(String[] args){
        int arr[] = {4, 1, 7, 4, 9, 8, 5, 8, 4, 13, 12, 15};
        int max = 0;
        int result=FindMax (arr, arr.length-1, max);
        System.out.println("nilai tertinggi = "+result);
        }
    }
