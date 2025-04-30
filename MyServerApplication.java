@SpringBootApplication
public class MyServerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RAGServerApplication.class, args);
        try {
            Environment environment = context.getBean(Environment.class);
            String active = environment.getProperty("spring.profiles.active");
            log.info("--------------------");
            log.info("启用的环境: {}", active);
            log.info("--------------------");
        } catch (Exception ignored) {
        }
    }
}
