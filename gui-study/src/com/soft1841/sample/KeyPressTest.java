package com.soft1841.sample;

import java.awt.Robot;
import java.awt.event.KeyEvent;


public class KeyPressTest {
public static void main(String[] args) {
Robot robot = null;
try {
robot = new Robot();
robot.keyPress(KeyEvent.VK_ALT);
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_Z);
//Thread.sleep(5000);//5秒
robot.keyRelease(KeyEvent.VK_ALT);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyRelease(KeyEvent.VK_Z);

} catch (Exception e) {
e.printStackTrace();
} finally{
    try{
robot.keyRelease(KeyEvent.VK_ALT);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyRelease(KeyEvent.VK_Z);
}catch(Exception e){}
}
}
}