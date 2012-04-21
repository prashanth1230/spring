package database1;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JustStuff {
	public static void main(String[] args) {
		ApplicationContext ctx;
		ctx = new ClassPathXmlApplicationContext("dataAccessContext1.xml");
		DataStuff test = (DataStuff) ctx.getBean("dataStuff");

		List l = test.getNames();
		Iterator i = l.iterator();
		while (i.hasNext()) {
			database1.Person p = (database1.Person) (i.next());
			System.out.println(p.getId() + p.getName());
		}

		// System.out.println("Before: " + test.getNames().size());
		test.updateAName(12, "Eric");
		List l1 = test.getNames();
		Iterator i1 = l1.iterator();
		while (i1.hasNext()) {
			database1.Person p1 = (database1.Person) (i1.next());
			System.out.println(p1.getId() + p1.getName());
		}
		System.out.println("OK!");
	}
}