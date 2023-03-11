public class Contacts {
    public String name, phone, email;

    public Contacts(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}
