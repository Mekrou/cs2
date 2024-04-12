public class App {
    public static void main(String[] args) throws Exception {
        PhoneList phoneList = new PhoneList();
        PhoneListNode abby = new PhoneListNode("Abby", "529-8109");
        PhoneListNode gary = new PhoneListNode("Gary", "529-5112");
        PhoneListNode bob = new PhoneListNode("Bob", "555-5555");
        phoneList.insert(abby);
        phoneList.insert(gary);
        phoneList.insert(bob);
        phoneList.print();
        System.out.println(phoneList.remove("Abby"));
        System.out.println(phoneList.remove("Abby"));
        phoneList.print();
    }
}
