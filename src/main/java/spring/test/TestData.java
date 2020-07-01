package spring.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestData {
    private String data;
    private int counter;

    public TestData(String data) {
        this.data = data;
    }

    public String getData() {
        return data + ++counter;
    }

    public void setData(String data) {
        this.data = data;
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