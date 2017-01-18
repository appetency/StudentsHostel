package config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan
@EnableTransactionManagement
public class DataConfig implements TransactionManagementConfigurer {

  @Bean
  public DataSource dataSource() {   /*创建嵌入式数据库*/
    DruidDataSource ds=new DruidDataSource();
    ds.setUrl("127.0.0.1:3306");
    ds.setUsername("root");
    ds.setPassword("root");
    return ds;
  }
  /*声明Hibernate的Session工厂*/
  @Bean
  public LocalSessionFactoryBean sessionFactory(DataSource dataSource){
    LocalSessionFactoryBean sfb=new LocalSessionFactoryBean();
    sfb.setDataSource(dataSource);
    sfb.setPackagesToScan(new String[]{"domain"});/*packagesToScan属性告诉Spring扫描一个或多个包以查找域类，这些类通过注解的方式表明要使用Hibernate进行持久化，这些类可以使用的注解包括JPA的@Entity或@MappedSuperclass以及Hibernate的@Entity。*/


    Properties props=new Properties();
    props.setProperty("dialect","org.hibernate.dialect.MySQL5Dialect");
    sfb.setHibernateProperties(props);
    return sfb;

  }

    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return null;
    }
}