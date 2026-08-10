package gdd.sprite;

import static gdd.Global.*;
import javax.swing.ImageIcon;

public class Explosion extends Sprite {

    public Explosion(int x, int y) {

        // Keep the explosion visible for 30 frames
        visibleFrames = 30;

        initExplosion(x, y);
    }

    private void initExplosion(int x, int y) {

        this.x = x;
        this.y = y;

        ImageIcon imageIcon =
                new ImageIcon(IMG_EXPLOSION);

        var scaledImage =
                imageIcon.getImage().getScaledInstance(
                        imageIcon.getIconWidth()
                                * SCALE_FACTOR,
                        imageIcon.getIconHeight()
                                * SCALE_FACTOR,
                        java.awt.Image.SCALE_SMOOTH
                );

        setImage(scaledImage);
    }

    @Override
    public void act() {
        // Explosion does not move.
    }
}