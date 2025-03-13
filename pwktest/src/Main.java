public class Main {
    public static void main(String[] args) {
        int[] tba = {1,2,3,4,5};
        show(filteeEvenIndexOddValue(tba));
    }
    public static int[] filteeEvenIndexOddValue(int[] array){
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
    public static void show(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}