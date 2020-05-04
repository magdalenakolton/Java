package sample;

import java.awt.*;

public class Point {
    int x;
    int y;
    Color color;


    public Point(int x, int y, Color color)
    {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public Color getColor()
    {
        return color;
    }
}
