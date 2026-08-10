package gdd.sprite;

import static gdd.Global.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Player extends Sprite {

    private static final int START_X = 270;
    private static final int START_Y = 540;

    private int width;
    private int height;
    private int currentSpeed = 4;

    public Player() {
        initPlayer();
    }

    private void initPlayer() {

        ImageIcon imageIcon = new ImageIcon(IMG_PLAYER);

        var scaledImage = imageIcon.getImage().getScaledInstance(
                imageIcon.getIconWidth() * SCALE_FACTOR,
                imageIcon.getIconHeight() * SCALE_FACTOR,
                java.awt.Image.SCALE_SMOOTH
        );

        setImage(scaledImage);

        width = scaledImage.getWidth(null);
        height = scaledImage.getHeight(null);

        setX(START_X);
        setY(START_Y);
    }

    public int getSpeed() {
        return currentSpeed;
    }

    public int setSpeed(int speed) {

        if (speed < 1) {
            speed = 1;
        }

        currentSpeed = speed;
        return currentSpeed;
    }

    @Override
    public void act() {

        x += dx;
        y += dy;

        // Left side
        if (x < 0) {
            x = 0;
        }

        // Right side
        if (x > BOARD_WIDTH - width) {
            x = BOARD_WIDTH - width;
        }

        // Top side
        if (y < 0) {
            y = 0;
        }

        // Bottom side
        if (y > BOARD_HEIGHT - height) {
            y = BOARD_HEIGHT - height;
        }
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT
                || key == KeyEvent.VK_A) {

            dx = -currentSpeed;
        }

        if (key == KeyEvent.VK_RIGHT
                || key == KeyEvent.VK_D) {

            dx = currentSpeed;
        }

        if (key == KeyEvent.VK_UP
                || key == KeyEvent.VK_W) {

            dy = -currentSpeed;
        }

        if (key == KeyEvent.VK_DOWN
                || key == KeyEvent.VK_S) {

            dy = currentSpeed;
        }
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT
                || key == KeyEvent.VK_RIGHT
                || key == KeyEvent.VK_A
                || key == KeyEvent.VK_D) {

            dx = 0;
        }

        if (key == KeyEvent.VK_UP
                || key == KeyEvent.VK_DOWN
                || key == KeyEvent.VK_W
                || key == KeyEvent.VK_S) {

            dy = 0;
        }
    }
}