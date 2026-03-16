public class Factorial {
    private int testCase;

    public int getTestCase() {
        return testCase;
    }

    public void setTestCase(int testCase) {
        if (testCase >=1 && testCase <= 15) {
            this.testCase = testCase;
        }
    }

    public void factorial (int [] array) {
        for (int i = 0; i < array.length; i++) {
            long factorial = 1;
            for (int j = 2; j <= array[i]; j++) {
                factorial *= j;

            }

            System.out.println(factorial);
        }
    }


}

