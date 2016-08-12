package spike;

import org.junit.*;

import static org.junit.Assert.*;

public class TestMain{

@Test public void test()throws InterruptedException{
	assertTrue(3+4==7);
	assertTrue(2+2==4);
	assertTrue(5+4+1+2==12);
	      	Thread.sleep(10*60*1000);
}

}
