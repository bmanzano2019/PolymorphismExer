package printers;

public class Printer {
    private String model;
    private String inkType;

    public Printer(String model, String inkType) {
        this.model = model;
        this.inkType = inkType;
    }

    public void print() {
        System.out.println("printing...");
    }

    public String getModel() {
        return model;
    }

    public String getInkType() {
        return inkType;
    }
}
