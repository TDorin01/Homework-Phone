public class Main {
    public static void main(String[] args) {
        Phone phone = new SamsungGalaxyS24("1234567890", "Black", "Plastic");
        System.out.println("My phone is " + phone);
        phone.addContact("1", "0741000000", "David", "Pop");
        phone.addContact("2", "0742000000", "Anastasia", "Carolina");

        System.out.println("First contact: " + phone.getFirstContact());
        System.out.println("Last contact: " + phone.getLastContact());

        phone.sendMessage("0741000000", "Hello, David!");
        phone.sendMessage("0741000000", "How are you today?");
        System.out.println("First message: " + phone.getFirstMessage("0741000000"));
        System.out.println("Second message: " + phone.getSecondMessage("0741000000"));

        phone.call("0742000000");
        System.out.println("Call history: " + phone.viewHistory());
    }
}