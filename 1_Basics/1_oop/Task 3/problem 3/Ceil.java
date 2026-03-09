public class Ceil extends BaseEntity {
    public Ceil(int number, int divider) {
        int check1 = number / divider;
        float check2 = (float) number / divider;
        float check3 = check2 - check1;
        if (check3 == 0.0) {
            setResult(check1);
        } else if (check3 > 0.0){
            setResult(check1 + 1);
        }
        System.out.println("ceil " + number + " / " + divider + " = " + getResult());

    }
}