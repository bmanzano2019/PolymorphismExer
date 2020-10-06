package printers;

public class ColorPrinter extends Printer {
    public ColorPrinter(String model) {
        super(model, "colored");
    }

    @Override
    public void print() {
        System.out.println("printing with colored ink...");
    }

    public void print(String inkType) {
        System.out.println("printing with user-specified " + inkType + " ink...");
    }

}
