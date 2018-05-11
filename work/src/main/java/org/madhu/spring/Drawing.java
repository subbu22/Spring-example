package org.madhu.spring;

import org.madhu.spring.bean.Rectangle;
import org.madhu.spring.bean.Shape;
import org.madhu.spring.bean.Triangle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	 private static AbstractApplicationContext ac;
	


	public static void main(String[] args) {
		
		
		ac = new ClassPathXmlApplicationContext("spring.xml");
		ac.registerShutdownHook();
		Shape t= (Shape) ac.getBean("Triangle");
		Shape r= (Shape) ac.getBean("rectangle");
		r.draw();
		t.draw();
		
		  /*
			Triangle tt= (Triangle) ac.getBean("triangle-alias");
			tt.draw();*/
		
	}
}
