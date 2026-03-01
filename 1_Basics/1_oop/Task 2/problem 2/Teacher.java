public class Teacher {

    private Long id;
    private String name;
    private float age;
    private String phoneNumber;
    private float salary;


    public void setId(Long id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("id must be > 0");
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name != null && name.matches("^[a-zA-Z]{3,}$")) {
            this.name = name;
        } else {
            System.out.println("name must be letters only and >= 3 chars");
        }
    }


    public void setAge(float age) {
        if (age >= 25 && age <= 60) {
            this.age = age;
        } else {
            System.out.println("age must be between 25 and 60");
        }
    }


    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.matches("^\\+20\\d{10}$")) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("phone number must start with +20 and be 13 chars");
        }
    }


    public void setSalary(float salary) {
        if (salary >= 3000) {
            this.salary = salary;
        } else {
            System.out.println("Error: salary must be >= 3000");
        }
    }


}