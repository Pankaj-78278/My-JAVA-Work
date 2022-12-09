package com.masai.Theory;

public class Q2 {
//- How many scopes are there for a Spring Bean, which is the default scope for a Spring
//	Bean? Explain with an example.

	
//	ANS :- The spring framework provides five scopes for a bean. We can use
//	three of them only in the context of web-aware Spring ApplicationContext 
//	and the rest of the two is available for both IoC container and Spring-MVC container.
//	
	
//	Singleton: Only one instance will be created for a single bean definition
//	per Spring IoC container and the same object will be shared for each request 
//	made for that bean and this is also default scope from all of them.
//	
//	
//	Prototype: A new instance will be created for a single bean definition 
//	every time a request is made for that bean.
//	
//	
//	Request: A new instance will be created for a single bean definition every 
//	time an HTTP request is made for that bean. But Only valid in the context of a 
//	web-aware Spring ApplicationContext.
//	
//	
//	Session: Scopes a single bean definition to the lifecycle of an HTTP Session.
//	But Only valid in the context of a web-aware Spring ApplicationContext.
//	
//	
//	Global-Session: Scopes a single bean definition to the lifecycle of a global 
//	HTTP Session. It is also only valid in the context of a web-aware Spring 
//	ApplicationContext.
	
//	Using this annotation we define scope of a spring bean.
	
//	 Default scope for a spring bean is "singleton" scope.
//	Example:
//	@Service
//	@Scope("prototype")
//	public class A {
//	--
//	}

	
}
