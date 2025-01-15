package Searching;

public class RotatedSortedarr {
        // Binary search method
        public static int binarySearch(int[] arr, int lo, int hi, int target) {
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (arr[mid] == target) return mid;
                else if (arr[mid] > target) hi = mid - 1;
                else lo = mid + 1;
            }
            return -1;
        }

        // Method to find the pivot (point of rotation)
        public static int findPivot(int[] arr) {
            int lo = 0, hi = arr.length - 1;
            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;
                if (arr[mid] > arr[hi]) lo = mid + 1; // Pivot is in the right half
                else hi = mid; // Pivot is in the left half
            }
            return lo; // Pivot index
        }

        public static void main(String[] args) {
            int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
            int target = 1;

            int n = arr.length;
            if (n == 0) {
                System.out.println("Target not found");
                return;
            }

            int pivot = findPivot(arr);

            // If the array is not rotated, pivot will be 0
            if (arr[pivot] <= target && target <= arr[n - 1]) {
                // Search in the right half
                int result = binarySearch(arr, pivot, n - 1, target);
                System.out.println(result == -1 ? "Target not found" : "Target found at index: " + result);
            } else {
                // Search in the left half
                int result = binarySearch(arr, 0, pivot - 1, target);
                System.out.println(result == -1 ? "Target not found" : "Target found at index: " + result);
            }
        }
    }


