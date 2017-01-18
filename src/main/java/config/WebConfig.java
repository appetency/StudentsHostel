package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.io.IOException;

/*web配置*/
@Configuration
@EnableWebMvc   /*启用Spring MVC*/
@ComponentScan("spittr.web") /*启用组件扫描 根据需要更改要扫描的路径*/
public class WebConfig extends WebMvcConfigurerAdapter {

  @Bean
  public ViewResolver viewResolver() {
    InternalResourceViewResolver resolver = new InternalResourceViewResolver(); /*配置jsp视图解析器*/
    resolver.setPrefix("/WEB-INF/views/");
    resolver.setSuffix(".jsp");
    resolver.setViewClass(JstlView.class);   /*将视图解析为JstlView       p168*/
    return resolver;
  }

  @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    configurer.enable();/*将对静态资源的请求转发到Servlet容器中默认的Servlet上，而不是使用DispatcherServlet本身来处理此类请求。*/
  } /*配置静态资源的处理*/

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    // TODO Auto-generated method stub
    super.addResourceHandlers(registry);
  }

  @Bean
/*MultipartResolver的实现
  依赖于Servlet 3.0对multipart请求的支持
*/
  public MultipartResolver multipartResolver() throws IOException {
    return new StandardServletMultipartResolver();
  }
/*具体配置在SpitterWebInitializer*/
/*@Bean
public MultipartResolver multipartResolver()throws IOException{
        CommonsMultipartResolver multipartResolver= new CommonsMultipartResolver();
        multipartResolver.setUploadTempDir(new FileSystemResource("/tmp/spittr/uploads"));
        multipartResolver.setMaxUploadSize(2097152);
        multipartResolver.setMaxInMemorySize(0);
        return multipartResolver;
  我们将最大的文件容量设置为2MB，最大的内存大小设置为0字节。这两个属性直接
  对应于MultipartConfigElement的第二个和第四个构造器参数，表明不能上传超过2MB
  的文件，并且不管文件的大小如何，所有的文件都会写到磁盘中。但是
  与MultipartConfigElement有所不同，我们无法设定multipart请求整体的最大容量。
        }*/
/*@Bean
public MessageSource messageSource() {   //国际化配置
    ReloadableResourceBundleMessageSource messageSource =
            new ReloadableResourceBundleMessageSource();
    messageSource.setBasename("file:///Users/habuma/messages");
    messageSource.setCacheSeconds(10);
    return messageSource;
}*/


//Apache Tiles
   /* // Tiles
    @Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer tiles = new TilesConfigurer();
        tiles.setDefinitions(new String[] {
                "/WEB-INF/layout/tiles.xml",
                "/WEB-INF/views*//**//*tiles.xml"  加载“/WEB-INF/”目录下的所有名字为tiles.xml的文件
        });
        tiles.setCheckRefresh(true);    //启用刷新功能
        return tiles;
    }

    @Bean
    public ViewResolver viewResolver() {
        return new TilesViewResolver();
    }*/

  /*//配置Thymeleaf视图解析器
    @Bean
    public ViewResolver viewResolver(SpringTemplateEngine templateEngine) {     *//*Thymeleaf视图解析器*//*
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine);
        return viewResolver;
    }
    @Bean
    public SpringTemplateEngine templateEngine(TemplateResolver templateResolver) {    *//*模板引擎*//*
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        return templateEngine;
    }

    @Bean
    public TemplateResolver templateResolver() {
        TemplateResolver templateResolver = new ServletContextTemplateResolver();  *//*模板解析器*//*
        templateResolver.setPrefix("/WEB-INF/views/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML5");  //渲染成HTML 5输出
        return templateResolver;
    }*/
}
