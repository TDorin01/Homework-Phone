class AppleiPhone10 extends Phone {
    public AppleiPhone10(String IMEI, String color, String material) {
        super(20, IMEI, color, material);
    }

    @Override
    public String getProducer() {
        return "Apple";
    }

    @Override
    public String getModel() {
        return "iPhone 12";
    }
}