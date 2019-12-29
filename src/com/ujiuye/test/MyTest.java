package com.ujiuye.test;

        import com.ujiuye.pojo.Boy;
        import com.ujiuye.pojo.CollectionBean;
        import com.ujiuye.pojo.Girl;
        import com.ujiuye.pojo.User;
        import org.junit.Test;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

        import java.util.Arrays;
        import java.util.Map;
        import java.util.Properties;
        import java.util.Set;

public class MyTest {
    @Test
    public void test(){
        //创建spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //向容器要对象
        User user = (User) applicationContext.getBean("user");
        //调方法
        user.getUser();
    }
    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Boy boy = (Boy) applicationContext.getBean("boy");
        System.out.println(boy);
    }

    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Girl girl = (Girl) applicationContext.getBean("girl");
        System.out.println(girl);
    }
    @Test
    public void test4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean col = (CollectionBean) applicationContext.getBean("col");
        System.out.println(Arrays.toString(col.getArr()));
    }
    @Test
    public void test5(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean col = (CollectionBean) applicationContext.getBean("col");
        System.out.println(col.getList());
    }
    @Test
    public void test6(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean col = (CollectionBean) applicationContext.getBean("col");
        Map map = col.getMap();
        Set<Map.Entry> set = map.entrySet();
        for (Map.Entry entry: set) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+":"+value);
        }
    }

    @Test
    public void test7(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean col = (CollectionBean) applicationContext.getBean("col");
        Properties properties = col.getProperties();
        System.out.println(properties);
    }
}
