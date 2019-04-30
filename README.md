# dem-spring-boot-starter
简洁的springBoot starter (Auto-configuration)

[参考的博客](https://www.cnblogs.com/yuansc/p/9088212.html)
1. resources/META-INF/spring.factories ->AutoConfigure类
2. AutoConfigure类 -> @EnableConfigurationProperties ->注入配置文件
3. AutoConfigure类 -> @Conditional 配置自动装载Bean
## 测试
1. mvn install
2. 在新项目maven的pom.xml引入maven依赖
1. 在新项目的application.yml添加
```
com:
  example:
    demospringbootstarter:
      enabled: true
      config: aaa,bbb,ccc
```
2. 在新项目的springBoot测试环境
```
    @Autowired
    private StarterService starterService;

    @Test
    public void starterTest() {
        String[] splitArray = starterService.split(",");
        for (String s : splitArray) {
            System.out.println(s);
        }
    }
```