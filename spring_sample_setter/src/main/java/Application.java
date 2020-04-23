import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
@Profile(value = { "" })


public class Application {
 
//@Autowired
//	private static CustomerService service;

	public static void main(String[] args) {
	  ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
	  
     // CustomerService service = new CustomerServiceImpl();
	 CustomerService service = appContext.getBean("customerService", CustomerService.class);
	 
	 
	//	ApplicationContext appContext = new FileSystemXmlApplicationContext("applicationContext.xml");
	
		System.out.print(service.findAll().get(0).getFirstname());
	}

}

