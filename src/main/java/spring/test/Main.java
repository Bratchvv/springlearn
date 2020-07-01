package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        String configPath = "test-bean.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configPath);

        String configPath2 = "test-bean2.xml";
        ApplicationContext context2 = new ClassPathXmlApplicationContext(configPath2);

        TestMessage testMessage = (TestMessage) context.getBean("testMessage");
        System.out.println(testMessage.getMessage());

        TestData testData = (TestData) context.getBean("testData");
        System.out.println(testData.getData());

        ComplexBean complexBean = (ComplexBean) context.getBean("complexBean");
        complexBean.test();

        ComplexBean complexBean2 = (ComplexBean) context.getBean("complexBean2");
        complexBean2.test();

        ComplexBean complexBean3 = (ComplexBean) context.getBean("complexBean3");
        complexBean3.test();




        TestMessage testMessage2 = (TestMessage) context2.getBean("testMessage");
        System.out.println(testMessage2.getMessage());

        TestData testData2 = (TestData) context2.getBean("testData");
        System.out.println(testData2.getData());

        ComplexBean complexBean22 = (ComplexBean) context2.getBean("complexBean");
        complexBean22.test();

    }
}
