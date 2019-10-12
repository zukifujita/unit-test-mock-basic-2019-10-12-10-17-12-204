package posmachine;

class PosMachine {

    private final PriceCalculator calculator;

    public PosMachine(PriceCalculator calculator) {
        this.calculator = calculator;
    }

    public String getReceipt(String productName) {
        double price = calculator.calculate(productName);
        return String.format("Name: %s, Price: %s", productName, price);
    }
}
