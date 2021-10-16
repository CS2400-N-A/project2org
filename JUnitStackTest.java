import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class JUnitStackTest {
	@Test
	public void convertToPostfixTest(){
		String testOne = "(a+b)+(c*d)";
		assertEquals("ab+cd*+", LinkedStackTest.convertToPostfix(testOne));
	}

	@Test
	public void convertToPostfixTest2(){
		assertEquals("ab/c*deh^+-", LinkedStackTest.convertToPostfix("(a/b*c)-(d+(e^h))"));
	}
}