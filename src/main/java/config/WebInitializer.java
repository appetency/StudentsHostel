package config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * Created by Administrator on 2016/12/27.
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class };
    }
    /*
      getRootConfigClasses()方法返回的带有@Configuration注解的类将会 用来配置ContextLoaderListener创建的应用上下文中的bean。
    */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    }
  /*getServletConfigClasses()方法中，我们要求DispatcherServlet加载应用上下文时，使用定义在WebConfig配置类（使用Java配置）中的bean。*/
/*
  GetServlet-ConfigClasses()方法返回的带有@Configuration注解的类将会用来定义DispatcherServlet应用上下文中的bean。
*/

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }  /*它会将一个或多个路径映射 到DispatcherServlet上*/

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {  /*通过重载customizeRegistration()方法（它会得到一个Dynamic作为参数）来配置multipart的具体细节*/
        registration.setMultipartConfig(
                new MultipartConfigElement("/tmp/spittr/uploads", 2097152, 4194304, 0));
    }
}