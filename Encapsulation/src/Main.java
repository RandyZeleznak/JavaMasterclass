public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("INitial pages = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(5);
        System.out.println("Pages Printed :" +pagesPrinted+ "Total pages printed :" +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(8);
        System.out.println("Pages Printed :" +pagesPrinted+ "Total pages printed :" +printer.getPagesPrinted());

    }
}
