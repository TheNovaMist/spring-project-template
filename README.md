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


## ssm-jsp-template

SpringMVC + JSP 使用视图解析器将 `/hello` 请求映射到 `/WEB-INF/jsp/hello.jsp`

1. 创建项目，【*Add FrameWork Support*】添加 WebApp 依赖。
2. 在 `pom.xml` 引入 spring-webmvc 依赖。（目前不需要 servlet jsp 相关依赖）
3. 在 `web` 目录添加相应文件，配置 `web.xml` 文件
   - 设置 `<servlet>` 和 `<servlet-mapping>`
   - 关联 SpringMVC 配置文件
4. 配置 `spring-mvc.xml`
   - 开启注解支持(默认开启)
   - 设置自动扫描包
   - 设置不处理静态资源
   - 开启支持 mvc 注解驱动
   - 设置视图解析器拼接前缀、后缀
5. 编写一个 Controller。 
   - 使用 @Controller 注入 bean
   - @RequestMapping 映射请求路径
6. 【Ctrl + Alt + Shift + S】打开 *Project Structure*， 选择设置 *Artifacts*，在 `/WEB-INF` 目录下新建 `lib` 目录并添加 SpringMVC 相关依赖。
7. 配置 Tomcat 并启动，需要将 *Deployment* 菜单的 *Application Context* 设为 `/`

注意：如果运行出现问题，要检查 `out` 目录下的 war 包结构，`WEB-INF` 目录下的 `classes` 和 `lib` 是平级的。

