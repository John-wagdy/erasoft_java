public class ShareData extends BaseEntity {
    private String phone;

    public String getPhone() { return phone; }

    public void setPhone(String phone) {
        if (phone != null && phone.matches("^\\d{11}$")) {
            this.phone = phone;
        } else {
            System.out.println("phone must be 11 digits");
        }
    }
}