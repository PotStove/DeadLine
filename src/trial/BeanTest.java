package trial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	ApplicationContext ctx = new ClassPathXmlApplicationContext(
		"trial/beans.xml");
	System.out.println(ctx);
	Chinese p = ctx.getBean("chinese2", Chinese.class);
	p.useAxe();
    }

}
