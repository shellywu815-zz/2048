import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Square {
    private int px;
    private int py;

    private int width;
    private int height;
    private int value;

    private Color color;

    /**
     * Constructor
     */
    public Square(int px, int py, int width, int height, int value) {
        this.px = px;
        this.py = py;
        this.width = width;
        this.height = height;
        this.value = value;
        this.setColor();
    }

    /***
     * GETTERS
     **********************************************************************************/
    public int getPx() {
        return this.px;
    }

    public int getPy() {
        return this.py;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getValue() {
        return this.value;
    }

    public Color getColor() {
        return this.color;
    }

    /***
     * SETTERS
     **********************************************************************************/
    public void setPx(int px) {
        this.px = px;

    }

    public void setPy(int py) {
        this.py = py;

    }

    public void setValue(int value) {
        this.value = value;
        this.setColor();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setColor() {
        // System.out.println("Fascinating");
        if (value == 0) {
            this.color = new Color(255, 255, 255);
        }
        if (value == 2) {
            this.color = new Color(238, 228, 218);
        }
        if (value == 4) {
            this.color = new Color(237, 224, 200);
        }
        if (value == 8) {
            this.color = new Color(242, 177, 121);
        }
        if (value == 16) {
            this.color = new Color(245, 149, 99);
        }
        if (value == 32) {
            this.color = new Color(246, 124, 95);
        }
        if (value == 64) {
            this.color = new Color(246, 94, 59);
        }
        if (value == 128) {
            this.color = new Color(237, 207, 114);
        }
        if (value == 256) {
            this.color = new Color(237, 204, 97);
        }
        if (value == 512) {
            this.color = new Color(237, 200, 80);
        }
        if (value == 1024) {
            this.color = new Color(237, 197, 63);
        }
        if (value == 2048) {
            this.color = new Color(237, 194, 46);
        }

    }

    /***
     * UPDATES AND OTHER METHODS
     ****************************************************************/

    /**
     * Moves the object by its velocity. Ensures that the object does not go outside
     * its bounds by clipping.
     */

    /**
     * Default draw method that provides how the object should be drawn in the GUI.
     * This method does not draw anything. Subclass should override this method
     * based on how their object should appear.
     * 
     * @param g The <code>Graphics</code> context used for drawing the object.
     *          Remember graphics contexts that we used in OCaml, it gives the
     *          context in which the object should be drawn (a canvas, a frame,
     *          etc.)
     */
    public void draw(Graphics g) {
        setColor();
        g.setColor(this.getColor());
        g.fillRect(this.px * 90, this.py * 90, this.width * 80, this.height * 80);
        g.setColor(new Color(255, 255, 255));
        g.setFont(new Font("Arial", 32, 32));
        if (this.getValue() != 0) {
            g.drawString(this.value + "", this.px * 90 + 
                    40 - (g.getFontMetrics().stringWidth(this.value + "") / 2),
                    this.py * 90 + 50);
        }
    }
}