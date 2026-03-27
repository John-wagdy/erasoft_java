 public class Digits {
    private int testcases;
    private long[] digits;

    public int getTestcases() {
        return testcases;
    }

    public void setTestcases(int testcases) {
        if (testcases > 0 && testcases <= 10) {
            this.testcases = testcases;
        }
    }

    public long[] getDigits() {
        return digits;
    }

    public void setDigits(long[] digits) {
        this.digits = digits;
    }

    public void digits (long [] digits){
        for (int i = 0; i < digits.length; i++) {
            String s = String.valueOf(digits[i]);
            for (int j = s.length() -1; j >= 0; j--) {
                System.out.print(s.charAt(j)+ " ");
            }
            System.out.println();
        }
    }



}