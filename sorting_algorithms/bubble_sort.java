/**
 * Bubble sort
 * Repeatedly swaps adjacent elements if they are in the wrong order
 * It "bubbles" the largest unsorted value to the end in each loop
 * Then it avoids the sorted value at the last and does the same again to move the 2nd largest val to the last
 * Advantages - Simple to understand and implement, Good for small datasets, Easy to detect if the list is already sorted
 * Disadvantages - Very inefficient on large datasets, Performance degrades quickly as input size increases
 * When to use - Small input sizes, Educational purposes
 *  */

// class
public class bubble_sort {

    // method for bubble sort algorithm
    public static void bubbleSort(int[] arr){
        int size = arr.length;
        boolean is_swapped;

        //outer loop
        // size-1 to stay inside index
        for(int i = 0; i < size-1; i++){ //decides how many elements to leave at the end in inner loop
            is_swapped = false;

            //inner loop
            // size-1-i leaves elements at last since its sorted
            for(int j=0; j < size-1-i; j++){ // this loop will move the largest number to the last

                // swap if 1st element > 2nd element
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    // check whether a swap is occured in the entire loop
                    is_swapped = true;
                }
            }

            // if no swap is occured in one entire loop, means the array is already sorted.
            // So break the outer loop and exit code
            if(!is_swapped){
                    break;
                }
        }
    }

    public static void main(String[] args){
        int[] numbers = {7,2,4,10,1}; 

        System.out.println("Before sorting:");
        printArray(numbers);
        System.out.println();

        bubbleSort(numbers);

        System.out.println("After sorting:");
        printArray(numbers);
    }

    // Method to print array
    public static void printArray(int[] arr){
        for (int value : arr){
            System.out.print(value + " ");
        }
    }
}
