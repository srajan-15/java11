package componentscan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;


@Component
public class Driver {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("component.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
	Student student=beanFactory.getBean("student",Student.class);
	Trainer trainer=beanFactory.getBean("trainer", Trainer.class);
	student.duty();
	trainer.duty();
}
}
