class AppleiPhone14 extends Phone {
    public AppleiPhone14(String IMEI, String color, String material) {
        super(25, IMEI, color, material);
    }

    @Override
    public String getProducer() {
        return "Apple";
    }

    @Override
    public String getModel() {
        return "iPhone 14";
    }
}
