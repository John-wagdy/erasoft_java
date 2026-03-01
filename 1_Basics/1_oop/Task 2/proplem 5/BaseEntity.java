public class BaseEntity {
    private long id;
    private String name;

    public long getId() { return id; }
    public String getName() { return name; }

    public void setId(long id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("id must be greater than 0");
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("name is not valid");
        }
    }
}