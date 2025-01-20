package com.kodilla.spring;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Square;
import com.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KodillaSpringApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testCircleLoadedIntoContainer() {
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Circle shape = context.getBean(Circle.class);

		String name = shape.getShapeName();

		assertEquals("This is Circle !", name );

	}
	@Test
	void testTriangleLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Triangle shape = context.getBean(Triangle.class);

		//When
		String name = shape.getShapeName();

		//Then
		assertEquals("This is Triangle!", name);
	}
	@Test
	void testSquareLoadedIntoContainer() {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

		Square shape = context.getBean(Square.class);
		String name = shape.getShapeName();

	assertEquals("Square", name);
	}

}
