import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class test {
    private static Robot robot = null;

    public static void main(String[] args) {
        try {
            robot = new Robot();
        } catch (AWTException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        klick(300,300);
    }

    public static void klick (int x, int y)
    {
        /* for (int i = 0; i < 500; i++)
        {
            robot.mouseMove(x+i, y+i);
            robot.delay(5);
        } */
        robot.setAutoDelay(5);
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_X);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_X);
        robot.keyPress(KeyEvent.VK_UP);
        robot.keyRelease(KeyEvent.VK_UP);
        robot.keyPress(KeyEvent.VK_UP);
        robot.keyRelease(KeyEvent.VK_UP);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        /* robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
        robot.delay(5);
        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
         */

        /* 
        Color color;
        color = robot.getPixelColor(x, y);
        System.out.println("red = " + color.getRed() + " blue " + color.getBlue() + " green " + color.getBlue());
        */
    }

}