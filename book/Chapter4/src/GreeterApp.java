public class GreeterApp {
    private KeyboardReader reader;

    public GreeterApp() {
        reader = new KeyboardReader();
    }

    public void run() {
        String name = "";
        reader.prompt("Please input your name here > ");
        name = reader.getKeyboardInput();
        reader.display(greet(name) + "\n");
    }

    public String greet(String name) {
        return "Hi " + name + ", nice to meet you.";
    }

    public static void main(String[] args) {
        GreeterApp greeterApp = new GreeterApp();
        greeterApp.run();
    }
}