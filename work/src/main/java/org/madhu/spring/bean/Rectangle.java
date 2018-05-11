package org.madhu.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class Rectangle implements Shape, BeanFactoryPostProcessor {
	
	private points i;
	private points j;
	private points k;
	private  points l;
	public points getI() {
		return i;
	}
	public void setI(points i) {
		this.i = i;
	}
	public points getJ() {
		return j;
	}
	public void setJ(points j) {
		this.j = j;
	}
	public points getK() {
		return k;
	}
	public void setK(points k) {
		this.k = k;
	}
	public points getL() {
		return l;
	}
	public void setL(points l) {
		this.l = l;
	}
	
public void draw() {
 
System.out.println("In Rectanle  = ");
		System.out.println("In Rectanle  = " + getI().getX()+ "  " +getI().getY());
		System.out.println("In Rectanle  = " + getJ().getX()+ "  " +getJ().getY());
		System.out.println("In Rectanle  = " + getK().getX()+ "  " +getK().getY());
		 
		
		
		
	}
public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
	System.out.println("in bean post processor");
	
}
 
	 
   

}
