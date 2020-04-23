import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean (name="customerService")
	public CustomerService getCustomerService()
	{
		//return new CustomerServiceImpl();

		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
	//	service.setCustomerRepository(getCustomerRepository());
		return service;	
	}
	
	@Bean(name="customRepo")
	public CustomerRepository getCustomerRepository()
	{
		return new HibernateCustomerRepositoryImpl();
	}

}
