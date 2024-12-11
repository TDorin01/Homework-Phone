class Contact {
    private final String id;
    private final String phoneNumber;
    private final String firstName;
    private final String name;

    public Contact(String id, String phoneNumber, String firstName, String name) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
