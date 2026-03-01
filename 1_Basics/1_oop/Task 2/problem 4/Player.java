public class Player extends BaseEntity {
    private int number;

    public int getNumber() { return number; }

    public void setNumber(int number) {
        if (number >= 0 && number <= 99) {
            this.number = number;
        } else {
            System.out.println("number must be between 0 and 99");
        }
    }
}