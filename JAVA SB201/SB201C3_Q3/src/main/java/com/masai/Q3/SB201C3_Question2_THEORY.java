 package com.masai.Q3;

public class SB201C3_Question2_THEORY {
		
//	- What do you mean by the IOC ? 
	
//	1> Spring IOC(Inversion of Control) is the core of Spring Framework.it create the Object
//	configure and assembles their dependencies,manages their entire life cycle.
//	
//	2> it is the mechanism to achieve losse coupling and dynamic binding of the objets 
//	at runtime ,objects ependencies are injected by other assembler objects.
//	
//	3>it allow classes to be lossely couples and therefore easier test and maintain.
	
//	- What is Dependency Injection ? :
	
//	1>It is to manage the components the make up the application 
//	
//	2>It is spring Framework through which the spring container "injects" objects into other
//	 or "dependencies"
//	 
//	3> dependency Injection makes our programming code lossely coupled . 
//	
//	4> to overcome the mainly two prroblem  Depency injection make;
//	a> Tight Coupling btw the classes;
//	b> Not easy for testing ;
//			
//	5> spring container is the external entity that will push the dependency object to the dependent 
//	class
	
//	- Explain the life cycle of the Spring Bean ?
//	
//	1>Spring container will control the life cycle of spring bean from instantiation 
//	to destruction .
//	
//	2>Spring is POJO class is simple java class.spring containe control the life cycle of life cycle of
//	spring bean .
//	
//	LIFE CYCLE OF SPRING BEAN
//	
//	1> Deos not Exist:-spring bean deos not exist 
//	
//	2>Instantiated:- spring containe the spring bean  class into the memory and create the bean 
//	
//	3> Initialized:- spring bean class user defined init method is configured;
//	
//	4>Service:- it providde the reference to the caller then the cller call it business 
//	method 
//	
//	5>Destroy:- it container dead/ shutdown when we call.
}
