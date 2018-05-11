package org.madhu.spring.bean;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape,ApplicationContextAware{

	private String type;
	private int num;
	private points a;
	private points b;
	private points c;
	private List<points> lPoint;
	 private static ApplicationContext  aw;
	
	public static ApplicationContext  getAw() {
		return aw;
	}
	public static void setAw(ApplicationContext  aw) {
		Triangle.aw = aw;
	}
	public List<points> getlPoint() {
		return lPoint;
	}
	public void setlPoint(List<points> lPoint) {
		this.lPoint = lPoint;
	}
	public points getA() {
		return a;
	}
	public void setA(points a) {
		this.a = a;
	}
	public points getB() {
		return b;
	}
	public void setB(points b) {
		this.b = b;
	}
	public points getC() {
		return c;
	}
	public void setC(points c) {
		this.c = c;
	}
	/*public Triangle(String type, int num) {
	
		this.type = type;
		this.num =(num);
		System.out.println("in two constructor");
	}*/
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void draw() {
		
//		Triangle ttt= (Triangle)aw.getBean("triangle-alias");
		
//		System.out.println("in list trangle "+aw.getAliases("Triangle")+" "+aw.getDisplayName()+" "+(ttt).getA().getX());
		lPoint = getlPoint();
		for (points point: lPoint) {
			
			System.out.println("in list trangle X= " +point.getX() +"  Y= "+point.getY());
		}
		
		System.out.println("In triangle  = " + getType()+ "  " +getNum());
		System.out.println("In triangle  = " + getA().getX()+ "  " +getA().getY());
		System.out.println("In triangle  = " + getB().getX()+ "  " +getB().getY());
		System.out.println("In triangle  = " + getC().getX()+ "  " +getC().getY());
		 
		
		
		
	}
	/*public Triangle(int num) {
		System.out.println("in int");
		this.num = num;
	}*/
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.aw = arg0;
		
	}
	 
	public void myInit() {
		System.out.println(" in my init method");
	}
}
