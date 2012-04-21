package database;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class JustStuff {
	public static void main(String[] args) {
		XmlBeanFactory ctx;
		ctx = new XmlBeanFactory(new ClassPathResource("dataAccessContext.xml"));
		DataStuff test = (DataStuff) ctx.getBean("dataStuff");
		System.out.println(test.getNames());
		System.out.println("OK!");
		test.setNames(4,"Prashanth4");
		System.out.println("Inserted a record!");
		for(int i=0;i<test.getNames().size();i++){
			System.out.println("Id and Name"+test.getNames().get(i).toString());
		}
		System.out.println(test.getNames());
		System.out.println("OK!");
		ctx.destroySingletons();
		
	}
}