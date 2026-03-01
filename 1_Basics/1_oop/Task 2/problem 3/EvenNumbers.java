public class EvenNumbers {
    private Integer n1;
    private Integer n2;
    private Integer n3;

    public Integer getN1() { return n1; }
    public Integer getN2() { return n2; }
    public Integer getN3() { return n3; }

    public void setN1(int value) {
        if (isEven(value)) {
            this.n1 = value;
        } else {
            System.out.println("pls enter even number");
        }
    }

    public void setN2(int value) {
        if (isEven(value)) {
            this.n2 = value;
        } else {
            System.out.println("pls enter even number");
        }
    }

    public void setN3(int value) {
        if (isEven(value)) {
            this.n3 = value;
        } else {
            System.out.println("pls enter even number");
        }
    }

    public boolean isEven(int x) {
        return x % 2 == 0;
    }

    public int sum() {
        return n1 + n2 + n3;
    }
}