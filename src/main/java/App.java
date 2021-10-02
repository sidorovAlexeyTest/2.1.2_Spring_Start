import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat1 = (Cat)applicationContext.getBean("cat");
        Cat cat2 = (Cat)applicationContext.getBean("cat");
        System.out.printf("Are equals cat - %s \n", cat1.equals(cat2));
        System.out.printf("Are equals helloWorldBeans - %s", bean1.equals(bean2));
    }
}