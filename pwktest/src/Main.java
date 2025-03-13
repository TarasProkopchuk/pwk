public class Main {
    public static void main(String[] args) {
        int[] tba = {1,2,3,4,5,6};
        int[] test = {5,5,5,5,1};
        show(filteeEvenIndexOddValue(tba));
        System.out.println(findDominator(test));
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
    public static int findDominator (int[] array) {
        int[] tab = new int[array.length/2];
        int count = 0;
        int result =-1;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    if (count>tab.length){
                       result = array[i];
                    }
                }
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