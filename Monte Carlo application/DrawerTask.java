package sample;

import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.canvas.GraphicsContext;
//import javafx.scene.paint.Color;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class DrawerTask extends Task<Double>
{
    int min = -8;
    int max = 8;
    double pointsNum = Double.parseDouble(Main.tfield.getText());
    Random random;
    int pointsHit = 0;
    double result = 0;
    int sizeXY = 400;

    ObservableList<Point> listOfPoints;

    @Override
    protected Double call() throws Exception
    {
        random = new Random();
        for(int i=0;i<pointsNum;i++)
        {

            if(isCancelled())
            {
                break;
            }

            double x = min + (max - min) * random.nextDouble();
            double y = min + (max - min) * random.nextDouble();

            int newX = (int) Math.floor((sizeXY-0)*(x+8)/(8+8)+0);
            int newY = (int) Math.floor((0-sizeXY)*(y+8)/(8+8)+sizeXY);

            if(Equation.calc(x, y) == true)
            {
                System.out.println("("+x+","+y+")");
                pointsHit++;
                listOfPoints.add(new Point(newX,newY,Color.YELLOW));
            }
            else { listOfPoints.add(new Point(newX,newY,Color.BLACK)); }
        }
        result = pointsHit / pointsNum *256;
        System.out.println("Hits: "+pointsHit+"/"+pointsNum);
        return result;
    }
    public DrawerTask(ObservableList<Point> observableList)
    {
        this.listOfPoints = observableList;
    }
}
