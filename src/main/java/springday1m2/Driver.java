package springday1m2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("mobile.xml");
	BeanFactory bF=new XmlBeanFactory(resource);
	
	Mobile mobile=(Mobile)bF.getBean("mobile");
	
}
}