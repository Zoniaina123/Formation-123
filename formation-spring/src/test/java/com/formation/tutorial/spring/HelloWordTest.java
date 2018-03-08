package com.formation.tutorial.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWordTest {

	public static void main(final String[] args) {
		// print message : case 1 via xml
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "appConfig.xml" });

		HelloWordTest test = new HelloWordTest();
		test.xmlSayHello(appContext);

		test.sayHello(appContext);
	}

	private void xmlSayHello(ClassPathXmlApplicationContext appContext) {
		HelloWorld helloBean = (HelloWorld) appContext.getBean("bean2");

		helloBean.getMessage();
	}

	private void sayHello(ClassPathXmlApplicationContext appContext) {
		Greeter greeter = (Greeter) appContext.getBean("bean1");
		System.out.println("Coucou Spring : " + greeter.sayHello());
	}

}
