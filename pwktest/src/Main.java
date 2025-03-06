

public class Main {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5};
        show(filterEvenIndexOddValue(tab));
    }
    public static int[] filterEvenIndexOddValue (int[] array){
        int[] array2 = new int[array.length];
        for (int i = 0; i < array2.length; i++) {
            if (i%2==0) {
                if (array[i] % 2 != 0) {
                    array2[i] = array[i];
                }
            }
        }
        return array2;
    }
    public static void show (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}