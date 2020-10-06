package printers;

public class BlackWhitePrinter extends Printer {
    public BlackWhitePrinter(String model) {
        super(model, "black");
    }

    @Override
    public void print() {
        System.out.println("printing with only black ink...");
    }
}
