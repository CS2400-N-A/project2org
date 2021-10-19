import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class JUnitStackTest {
	
	@Test
	public void convertToPostfixTest(){
		String testOne = "a * b / (c - a) + d * e";
		assertEquals("ab*ca-/de*+", LinkedStackTest.convertToPostfix(testOne));
	}

	@Test
	public void evaluatePostfixTest(){
		String test = "ab*ca-/de*+";
		assertEquals("33", ResizableArrayStackTest.evaluatePostfix(test));
	}
}