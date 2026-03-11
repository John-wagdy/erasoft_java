public class MaxMin {
    private int num1;
    private int num2;
    private int num3;
    private int min;
    private int max;

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }


    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void calculateMaxMin(int num1, int num2, int num3){
        if (num1 >= num2 && num1 >= num3){
        setMax(num1);
        }
        else if (num2 >= num1 && num2 >= num3){
            setMax(num2);
        }
        else{
            setMax(num3);
        }
        if (num1 <= num2 && num1 <= num3){
            setMin(num1);
        }
        else if (num2 <= num1 && num2 <= num3){
            setMin(num2);
        }
        else{
            setMin(num3);
        }
    }

}
