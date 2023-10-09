package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class UsageOfRobot {
public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	Runtime.getRuntime().exec("notepad");
	Robot r=new Robot();
	Thread.sleep(2000);
//	r.keyPress(KeyEvent.VK_M);
//	r.keyPress(KeyEvent.VK_S);
//	r.keyPress(KeyEvent.VK_D);
	r.keyPress(KeyEvent.VK_CAPS_LOCK);
	r.keyPress(KeyEvent.VK_R);
	r.keyPress(KeyEvent.VK_C);
	r.keyPress(KeyEvent.VK_B);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_R);
	r.keyPress(KeyEvent.VK_C);
	r.keyPress(KeyEvent.VK_B);
	Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_ENTER);
	
	
	
	

}
}
