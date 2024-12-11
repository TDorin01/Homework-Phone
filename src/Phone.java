import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class Phone {
    private final int initialBatteryLife;
    private int batteryLife;
    private final String IMEI;
    private String color;
    private String material;
    private final List<Contact> contacts = new ArrayList<>();
    private final Map<String, List<String>> messages  = new HashMap<>();
    private final List<String> callHistory = new ArrayList<>();

    public Phone(int batteryLife, String IMEI, String color, String material){
        this.initialBatteryLife = batteryLife;
        this.batteryLife = batteryLife;
        this.IMEI = IMEI;
        this.color = color;
        this.material = material;
    }

    public abstract String getProducer();
    public abstract String getModel();

    // Contact management
    public void addContact(String id, String phoneNumber, String firstName, String name) {
        contacts.add(new Contact(id, phoneNumber, firstName, name));
    }

    public Contact getFirstContact() {
        return contacts.get(0);
    }

    public Contact getLastContact() {
        return contacts.get(contacts.size() - 1);
    }

    // Messaging
    public void sendMessage(String phoneNumber, String content) {
        if (content.length() > 500) {
            throw new IllegalArgumentException("Message exceeds the 500 character limit!");
        }
        if (batteryLife <= 0) {
            throw new IllegalStateException("Battery is off!");
        }
        messages.putIfAbsent(phoneNumber, new ArrayList<>());
        messages.get(phoneNumber).add(content);
        batteryLife--;
    }

    public String getFirstMessage(String phoneNumber) {
        return messages.get(phoneNumber).get(0);
    }

    public String getSecondMessage(String phoneNumber) {
        return messages.get(phoneNumber).get(1);
    }

    // Calling
    public void call(String phoneNumber) {
        if (batteryLife < 2) {
            throw new IllegalStateException("Low battery for call!");
        }
        callHistory.add("Call to " + phoneNumber);
        batteryLife -= 2;
    }

    public List<String> viewHistory() {
        return callHistory;
    }
}