/* 
 * Selection sort
 * repeatedlty Finds smallest element and places it in the first position
 * Can be also done in reverse by finding largest ele and swapping with last ele
 * Adv - Fewer swaps that bubble sort
 * Disadv - not suitable for large datasets
 * When to use - for smaller datasets
 * 
*/

public class selection_sort {
    public static void selectionSort(int[] arr){
        int size = arr.length;

        //outer loop for traversing full array(except last, coz it will be naturally sorted at the end)
        for(int i=0; i < size-1; i++){
            int smallest_index=i;

            //inner loop for comparing the smallest index with entire array and update its value
            //this selects the index of the smallest element within the array
            for(int j = i+1; j < size; j++){
                if(arr[j] < arr[smallest_index]){
                    smallest_index = j; //update smallest index if cond satisfies
                }
            }

            //swap the smallest element with first element
            //arr[i] is the first element
            int temp = arr[smallest_index];
            arr[smallest_index] = arr[i]; //first ele in place of smallest ele
            arr[i] = temp; //smallest ele in place of first ele
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

        System.out.println("Array before selection sort: ");
        printArray(array);

        selectionSort(array);

        System.out.println("Array after selection sort: ");
        printArray(array);
    }
}
