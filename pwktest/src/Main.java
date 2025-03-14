public class Main {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5,6};
        int[] tab1 = {2,2,3,3,3};
        show(filterEvenIndexOddValue(tab));
        System.out.println(findDominant(tab1));
        int[] tab3 = {1,2,3,4,5};
        show(rotateArray(tab3,2));
    }
    public static int[] filterEvenIndexOddValue(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 != 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0 && array[i] % 2 != 0) {
                        result[j] = array[i];
                        j++;
                }
            }
        return result;
    }
    public static int findDominant (int[] array) {
        int tab_length = array.length/2;
        int count = 0;
        int result =-1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    if (count>tab_length){
                       result = array[i];
                       count=0;
                    }
                }
            }
        }
        return result;
    }
    public static int[] rotateArray (int[] array, int positions){
        int[] result = new int[array.length];
        for (int i = 0; i <positions; i++){
            for(int j =0; j <array.length; j++){
                if (j==array.length-1){
                    result[j-(array.length-1)] = array[j];
                }
                else{
                    result[j+1] = array[j];
                }
            }
                    for (int k = 0; k < array.length; k++){
                    array[k] = result[k];
                }
        }
        return result;
    }
    public static void show(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}