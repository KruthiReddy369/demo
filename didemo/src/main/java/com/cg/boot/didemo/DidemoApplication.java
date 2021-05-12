package com.cg.boot.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.cg.boot.didemo.bean.Address;
import com.cg.boot.didemo.bean.Person;

@SpringBootApplication
public class DidemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container= SpringApplication.run(DidemoApplication.class, args);
		Person p= container.getBean(Person.class);
		System.out.println(p.getSsn()+" "+p.getName());
		System.out.println(p.getAddress().getDno()+" "+p.getAddress().getCity()+" "+p.getAddress().getState());
		container.close();
	
	}
@Bean
public Address address()
{
	return new Address("1-2-3","hyd","ts");
}
@Bean
public Person person()
{
	Person p=new Person();
	p.setSsn(60);
	p.setName("arjun");
	return p;
}

}
