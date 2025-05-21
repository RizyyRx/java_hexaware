/*
 * Insertion sort
 * Insertion Sort builds the final sorted array one element at a time
 * It assumes the first element is already sorted.
 * Then it picks the next element and inserts it into the correct position among the already sorted elements on its left.
 * Adv- good for small and partially sorted arrays
 * Disadv - not recc for large datasets
 * Best case of O(n) where array is already sorted
 * worse case of O(n2) on reverse and random sorted arrays
 */

public class insertion_sort {
    public static void insertionSort(int[] arr){
        int size = arr.length;

        // outer loop to traverse entire array
        for(int i=1; i<size; i++){ // i = 1 coz it acts as the right element (key) to compare with
            int key = arr[i]; //key is right element (second element)
            int j = i-1; // j is left ele (first ele)

            // j should be >= 0 and if left>right
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j]; // shift the left ele to right
                j = j - 1; //decrement to compare previous elements with the key
            }

            // insert key at the correct position 
            arr[j+1] = key;
            //in first itertion, j will be -1, so j+1 will be 0 and key will be placed at 0th index
            //in cases where j is 0, because the 0th index is already less that key, j+1 is 1 and key is placed at 1th index
            // this will place the keys at correct position based on j's value.
            // at the end of the while loop, j's value shows the place where the condition failed. so key is placed after j, ie j+1
        }
    }    

    public static void printArray(int[] arr){
        for(int value : arr){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Array before insertion sort: ");
        printArray(array);

        insertionSort(array);

        System.out.println("Array after insertion sort: ");
        printArray(array);
    }
}
