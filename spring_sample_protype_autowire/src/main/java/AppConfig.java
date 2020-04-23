import java.util.Calendar;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import com.pluralsight.util.CalendarFactory;


//@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {
	
	@Bean(name="cal")
	public CalendarFactory calFactory() {
		CalendarFactory factory = new CalendarFactory();
		factory.addDays(2);;
		return factory;
	}
	
	@Bean
	public Calendar cal() throws Exception{
		return calFactory().getObject();
	}
	
	// no need bc use stereotype annotation, so the below is no longer needed. use @componentScan is needed @service and @repository
//	@Bean (name="customerService") //Bean can be declare only on the method level
// 	@Scope(value=BeanDefinition.SCOPE_SINGLETON)  //addr identical for each Bean
////	@Scope(value=BeanDefinition.SCOPE_PROTOTYPE) addr unique
//// request-> per request, session -> per seesion	
//
//	public CustomerService getCustomerService()
//	{
//		//return new CustomerServiceImpl();
//
//	//	CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository()); for @Bean anno only
//	
//		CustomerServiceImpl service = new CustomerServiceImpl();
//		
//		return service;	
//	}
//	
//	@Bean(name="customRepo")
//	public CustomerRepository getCustomerRepository()
//	{
//		return new HibernateCustomerRepositoryImpl();
//	}

}
