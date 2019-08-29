package hehe;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiji.day01.MyStudent;

public class Test01 {
	@Test
	public void t1() {
		ClassPathXmlApplicationContext cxa = new ClassPathXmlApplicationContext("com/jiji/day01/applicationContext.xml");
		MyStudent s = (MyStudent) cxa.getBean("student");
		System.err.println(s);
		
	}

	
	
}
