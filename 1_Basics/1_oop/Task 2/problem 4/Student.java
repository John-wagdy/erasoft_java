public class Student extends BaseEntity {
    private int age;

    public int getAge() { return age; }

    public void setAge(int age) {
        if (age > 7 && age < 30) {
            this.age = age;
        } else {
            System.out.println("age must be greater than 7 and less than 30");
        }
    }
}