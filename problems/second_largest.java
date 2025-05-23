public class second_largest {
    public static void main(String[] args){
        int[] array = {40,10,31,15};
        
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        System.out.println("initial values:");
        System.out.println("largest: " + largest);
        System.out.println("2nd largest:  " + second_largest);
        

        for (int i=0; i<array.length; i++){
            if(array[i]>largest){
                second_largest = largest;
                largest = array[i];
            } else if(array[i]>second_largest){
                second_largest = array[i];
            } 
            System.out.println("loop: " + i);
            System.out.println("largest ele: " + largest);
            System.out.println("2nd largest ele: " + second_largest);
        }

        System.out.println("final:");
        System.out.println("largest ele: " + largest);
        System.out.println("2nd largest ele: " + second_largest);

    }
}
