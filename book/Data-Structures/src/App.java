public class App {
    public static void main(String[] args) throws Exception {
        PhoneList phoneList = new PhoneList();
        PhoneListNode abby = new PhoneListNode("Abby", "529-8109");
        PhoneListNode gary = new PhoneListNode("Gary", "529-5112");
        // phoneList.insert(abby);
        // phoneList.insert(gary);
        phoneList.print();
    }
}
