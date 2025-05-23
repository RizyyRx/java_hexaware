
public class largest_in_array {
    public static void main(String[] args){
        int[] array = {1,10,31,4};
        int largest = array[0];

        for(int i=0; i<array.length; i++){
            if(largest < array[i+1]){
                largest = array[i+1];
            }
        }

        System.out.println("largest ele: " + largest);
    }
    
}
