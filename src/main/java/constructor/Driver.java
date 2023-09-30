package constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import constructor.Laptop;
public class Driver {
	Resource resource=new ClassPathResource("laptop.xml");
	BeanFactory bF=new XmlBeanFactory(resource);
	Laptop laptop=(Laptop)bF.getBean("laptop");
	
	
	
	
}
