package dependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
	Resource resource=new ClassPathResource("laptop.xml");
	BeanFactory bF=new XmlBeanFactory(resource);
	Company company=(Company)bF.getBean("laptop");
	
}
