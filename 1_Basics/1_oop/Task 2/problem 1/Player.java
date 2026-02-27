public class Player {
    private int number;
    private String name;

    public void setName(String name) {
        if (name.length() > 4){
        this.name = name;
    }
        else {
            System.out.println("name  not valid");
        }

    }

    public void setNumber(int number) {
        if (number > 0){
        this.number = number;
        }
        else {
            System.out.println("number must be more than 0");
        }


    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
