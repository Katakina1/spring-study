import com.kina.config.MyConfig;
import com.kina.pojo.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test() {
        // 如果完全使用了配置类的方式去做，我们就只能通过 AnnotationConfigApplicationContext上下文获取容器，通过配置类的class对象加载
        AnnotationConfigApplicationContext text = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = text.getBean("getUser", User.class);
        System.out.println(user.toString());
    }
}
