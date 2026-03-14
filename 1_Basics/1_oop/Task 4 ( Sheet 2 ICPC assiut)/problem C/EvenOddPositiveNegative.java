public class EvenOddPositiveNegative {
    private int size;
    private int[] array;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size >= 0) {
            this.size = size;
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
     public void output () {
        int evCounter = 0;
        int odCounter = 0;
        int poCounter = 0;
        int neCounter = 0;
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] % 2 == 0) {
                evCounter++;
            }
        }
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] < 0) {
                neCounter++;
            }
        }

         for (int i = 0 ; i < array.length ; i++) {
             if (array[i] % 2 != 0) {
                 odCounter++;
             }
         }
         for (int i = 0 ; i < array.length ; i++) {
             if (array[i] > 0) {
                 poCounter++;
             }
         }
         System.out.println("Even: " + evCounter);
         System.out.println("Odd: " + odCounter);
         System.out.println("Positive: " + poCounter);
         System.out.println("Negative: " + neCounter);

    }
}
