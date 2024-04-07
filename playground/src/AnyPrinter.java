public class AnyPrinter {
    private Object any;

    public AnyPrinter(Object any) {
        this.any = any;
    }

    public void print() {
        System.out.println(any);
    }
}