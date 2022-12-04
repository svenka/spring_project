package spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("spring_introduction")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    //CatBean bean id
    @Scope("singleton")
    public Pet catBean()
    {

        return new Cat();
    }
    @Bean
    @Scope("prototype")
    public Person personBean()
    {
        return new Person(catBean());
    }









}
