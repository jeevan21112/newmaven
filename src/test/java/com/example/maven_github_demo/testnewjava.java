package com.example.maven_github_demo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class testnewjava {
@Test 
void testTotal()
{
	assertEquals(225,replace.CalculateTotal(75, 68, 82));
}
@Test
void testaverage()
{
	assertEquals(75.0,replace.CalculateAverage(75, 68, 82));
}

@Test
void testpass()
{
		assertTrue(replace.isPass(75.0));
}
@Test
void testfail() 
{
		assertFalse(replace.isPass(35.0));

}
}
