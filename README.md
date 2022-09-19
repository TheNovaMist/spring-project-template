# 简介

## basic-template

SpringBoot 整合 Mybatis

参考：[My {Java} Academy (myjavaacademy.com)](https://myjavaacademy.com/spring-mybatis-integration-and-junit-testing-using-springs-embedded-database/)

1. 创建 SpringBoot 项目
2. 安装 `pom.xml` 依赖
3. SpringBoot 的 `application.yaml` 配置文件

   - 数据库
   - mybatis 驼峰下划线格式支持

4. 创建 mapper 和 pojo 类
数据库的创建和 `Employee.java` （不需要 `@Component`）按照文章中步骤
要注意 `EmployeeMapper.java` 是一个接口
5. 编写测试类
默认的 JUnit5 只需要 `@SpringBootTest` 注解，不需要 `@RunWith(SpringJUnit4ClassRunner.class)`
`@Before` 不起作用因为是 JUnit4 的注解，在 JUnit5 中是 `@BeforeEach`