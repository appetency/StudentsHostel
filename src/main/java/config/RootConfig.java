package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*过滤器配置*/
@Configuration
@ComponentScan(basePackages={"config"},
    excludeFilters={
        @Filter(type=FilterType.ANNOTATION, value= EnableWebMvc.class)
    })
public class RootConfig {

}
