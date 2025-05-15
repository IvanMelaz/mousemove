package mouse;

import java.awt.*;

public class MouseMover {

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();

            while (true) {
                // Get the current mouse position
                Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
                int x = (int) mouseLocation.getX();
                int y = (int) mouseLocation.getY();

                // Move the mouse slightly
                int newX = x + (int) (Math.random() * 5 - 2); // Small random movement
                int newY = y + (int) (Math.random() * 5 - 2);

                robot.mouseMove(newX, newY);

                // Wait for one minute (60,000 milliseconds)
                Thread.sleep(60000);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}