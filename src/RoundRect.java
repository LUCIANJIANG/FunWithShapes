import java.awt.Graphics;
public class RoundRect extends Shape{
    private int arcWidth;
    private int arcHeight;

    public RoundRect()
    {
        super();
        arcWidth = 50;
        arcHeight = 50;
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(getColor());
        g.drawRoundRect(getMinX(), getMinY(), getWidth(), getHeight(), arcWidth, arcHeight);
    }
}
