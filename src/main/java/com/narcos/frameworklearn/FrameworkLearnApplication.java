package com.narcos.frameworklearn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * SpringBootApplication 包含了 @ComponentScan
 * ComponentScan 只能扫描 FrameworkLearnApplication 所在当前包一下的 如果不在当前包 需要另外指定包的路径
 *
 * @author hbj
 */
@EnableAsync
@Slf4j
@SpringBootApplication
public class FrameworkLearnApplication {

//    @Autowired
//    Number number;

    public static void main(String[] args) {
//        SpringApplication.run(FrameworkLearnApplication.class, args);
//        Person personBean = applicationContext.getBean(Person.class);
//        Person person = (Person) applicationContext.getBean("person");
//        System.out.println("personBean : " + personBean.toString() + " personName : " + person.toString());
//        person.call();
        SpringApplication springApplication = new SpringApplication(FrameworkLearnApplication.class);
        springApplication.setBanner(new ResourceBanner(new ClassPathResource("fbi_warning.txt")));
//        springApplication.addInitializers(new SecondInitializer());
//        springApplication.addListeners(new SecondListener());
        springApplication.run();
    }
}
