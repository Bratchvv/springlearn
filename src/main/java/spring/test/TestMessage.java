package spring.test;

public class TestMessage {
    private String message;
    private int counter;

    public TestMessage() {
        System.out.println("TestMessage constructor");
    }

    public String getMessage() {
        return message + ++counter;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void onInit() {
        System.out.println("Initializing");
    }

    public void onDestroy() {
        System.out.println("Destroying");
    }
}
