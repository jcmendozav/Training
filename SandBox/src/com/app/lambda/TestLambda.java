package com.app.lambda;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class TestLambda {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		List<Person> personList = Arrays.asList(
				Person.of("fn1", "ln1", 40 , Arrays.asList("11","12")) 
				,Person.of("fn4", "ln4", 20 , Arrays.asList("241","242")) 
				,Person.of("fn2", "ln2", 20 , Arrays.asList("21","22")) 
				,Person.of("fn3", "ln3", 30 , Arrays.asList("31","32")) 

	
				);
				
		String result = personList.stream().
		map(p->p.getPhoneList()).
		flatMap(pl->pl.stream()).
		filter(n->n.startsWith("211")).
		findFirst().orElse("Not Found")
		;
		
		System.out.println("Result: "+result);

	}

}
