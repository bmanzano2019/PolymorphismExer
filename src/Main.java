import printers.Printer;
import printers.BlackWhitePrinter;
import printers.ColorPrinter;

import java.awt.*;

public class Main {
    public static void main (String[] args) {
        Printer commonPrinter = new Printer("common", "black");
        BlackWhitePrinter BWPrinter = new BlackWhitePrinter("Monotone");
        ColorPrinter cPrinter = new ColorPrinter("Bsus");

        // prints "printing..."
        commonPrinter.print();
        // demonstrates method overriding, same print() method prints different output
        // Overriding allows developer to modify some methods inherited from parent class
        // prints "printing with only black ink..."
        BWPrinter.print();
        // prints "printing with colored ink..."
        cPrinter.print();
        // demonstrates method overloading, same print() method name can accept different arguments
        // Overloading allows developer to specify multiple method implementations that can have different processing
        // prints "printing with user-specified pink ink..."
        cPrinter.print("pink");

    }
}
