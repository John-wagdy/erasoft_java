public class LuckyNumbers {
    private int A;
    private int B;

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public LuckyNumbers(int a, int b) {
        boolean check = false;
        String luckyNumbers;
        int counter = 0;
        for (int i = a; i <= b ; i++) {
            luckyNumbers = String.valueOf(i);
           for (int j = 0; j < luckyNumbers.length(); j++) {
               if (luckyNumbers.charAt(j) == '4' || luckyNumbers.charAt(j) == '7') {
                    counter += 1;
               }
               else {
                   counter = 0;
                   break;
               }
           }
           if (counter == luckyNumbers.length()) {
               System.out.print(i + " ");
               check = true;
            }

        }
        if (!check) {
            System.out.println(-1);
        }

    }


}
