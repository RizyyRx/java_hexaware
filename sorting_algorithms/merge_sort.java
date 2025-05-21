/*
 * Merge sort
 * uses divide and conquer method
 * recursively splits array into subarrays until they have single element
 * compares the subarrays and merges them back accordingly
 * Adv - best for large datasets
 * Time comp - O(n log n)
 */

public class merge_sort {

    // function to sort (recursive)
    public void sort(int[] arr, int left, int right){

        // checks if there is atleast two elements in an array to sort
        // while doing recursively, when there is only one element in the array,
        // the left and middle is the same element (left=right, i.e fails the condition)
        // So this part of the code needs 2 elements in an array to funcition
        if(left<right){
            int middle = (left+right)/2;

            //recursively sort the left and right sub-arrays until there is only one element in an array
            sort(arr, left, middle);    //range is left to middle since its left half
            sort(arr, middle+1, right); //range is middle+1 to right since middle is already included in left half

            merge(arr,left,middle,right);
            
        }
    }

    // method to merge two sorted subarrays (arrays with one ele is considered to be sorted)
    public void merge(int arr[], int left, int middle, int right){

        //size of left subarray
        int size1 = middle - left + 1; // +1 to compensate 0th index
        //size of right subarray
        int size2 = right - middle;

        //create temp left and right arrays (empty)
        int[] L = new int[size1];
        int[] R = new int[size2];


        //fill the left and right arrays correspodingly by using the original arr using left and middle values
        for(int i=0; i<size1; i++){
            L[i] = arr[left+i];
        }
        for(int j=0; j<size2; j++){
            R[j] = arr[middle + 1 + j]; // +1 coz middle is already included in left portion
        }

        // initial indexes for left, right and final merged array
        int i=0, j=0, k=left;

        // loop to check for smallest value and place it in orig arr at corresponding position
        while(i<size1 && j<size2){
            if(L[i] < R[j]){ 
                arr[k] = L[i];
                i++; // inc i coz current L[i] is included in the arr[k] 
            } else{
                arr[k] = R[j];
                j++;  // inc j coz current R[j] is included in the arr[k] 
            }

            k++; // inc k anyway to move to the next position on the orig arr
        }

        //copy if there are any remaning elements in the left and right arrays
        //there is a possibility where all elements in left array are included in the orig arr and some elements are left over in the right array and vice versa
        //so to handle this possibility, we simply copy the rem elements to orig arr
        //the remaining ele will already be sorted, so we can just copy them (first copy left arr and then right arr)
        while(i<size1){
            arr[k] = L[i]; //copy leftovers of left arr
            i++;
        }

        while(j<size2){
            arr[k] = R[j]; //copy leftovers of right arr
            j++;
        }
    }
    
    // Utility function to print the array
    public void printArray(int[] array) {
        for (int value : array)
            System.out.print(value + " ");
        System.out.println();
    }

    public static void main(String[] args){
        int[] array = {4, 8, 15, 3, 6, 20};

        merge_sort sorter = new merge_sort();

        System.out.println("Original array:");
        sorter.printArray(array);

        sorter.sort(array, 0, array.length - 1);

        System.out.println("Sorted array:");
        sorter.printArray(array);
    }
}
