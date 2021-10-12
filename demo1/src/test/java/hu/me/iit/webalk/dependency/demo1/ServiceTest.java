package hu.me.iit.webalk.dependency.demo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServiceTest{
	@Mock Dependency dependency;
	
	@InjectMocks ServiceImpl service;
	
	@Test
	void calculate() {}
	
	@Test
	void retot() {
		//GIVEN
		final int FIVE = 5;
		//WHEN
		int result = service.retot();
		
		//THEN
		assertEquals(FIVE, result);
	}

	@Test
	void dependencyReturnValueIsUsed() {
		//GIVEN
		final int FIVE = 5;
		//WHEN
		when(dependency.helpNoParameterNoReturnValue()).thenReturn(FIVE);
		//THEN
	}
	
}
