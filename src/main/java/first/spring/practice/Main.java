package first.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main{
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        MessageRenderer renderer = context.getBean("simpleMessageRenderer", MessageRenderer.class);
        renderer.render();
    }
}
