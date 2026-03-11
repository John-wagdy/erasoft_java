public class TheBrothers {
    private String firestName1;
    private String lastName1;
    private String firstName2;
    private String lastname2;

    public String getFirestName1() {
        return firestName1;
    }

    public void setFirestName1(String firestName1) {
        this.firestName1 = firestName1;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getFirstName2() {
        return firstName2;
    }

    public void setFirstName2(String firstName2) {
        this.firstName2 = firstName2;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public void AreBrothers(String lastName1, String lastname2) {
        if (lastName1.equals(lastname2)) {
            System.out.println("ARE Brothers");
        } else {
            System.out.println("NOT");
        }

    }
}