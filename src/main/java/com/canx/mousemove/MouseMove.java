package com.canx.mousemove;

import java.awt.*;

public class MouseMove {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        int mod = 1;

        while (true) {
            Thread.sleep(1000);
            Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
            robot.mouseMove((int) mouseLocation.getX() + mod, (int) mouseLocation.getY() + mod);
            mod *= -1;
        }
    }
}


