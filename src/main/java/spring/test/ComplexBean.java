package spring.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ComplexBean {
    private TestData testData;
    private TestMessage testMessage;

    public ComplexBean() {
        System.out.println("ComplexBean constructor");
    }

    public void test() {
        System.out.println("COMPLEX: " + testMessage.getMessage() + " and " + testData.getData());
    }

    public TestData getTestData() {
        return testData;
    }

    public void setTestData(TestData testData) {
        this.testData = testData;
    }

    public TestMessage getTestMessage() {
        return testMessage;
    }

    public void setTestMessage(TestMessage testMessage) {
        this.testMessage = testMessage;
    }

    @PostConstruct
    public void onDestroy() throws Exception {
        System.out.println("Destroying");
    }
    @PreDestroy
    public void afterInit() throws Exception {
        System.out.println("Initializing");
    }
}
