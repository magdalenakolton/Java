package sample;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.concurrent.WorkerStateEvent;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Main extends Application
{
    ObservableList<Point> observableListPoint;
    GraphicsContext gc;
    DrawerTask task;
    static TextField tfield;
    int sizeXY = 400;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Monte Carlo");
        VBox vBox = new VBox();
        Scene scene = new Scene(vBox, 400, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
        Canvas canvas = new Canvas(400,400);

        Button startBut = new Button("Start!");
        startBut.setTranslateX(10);
        startBut.setTranslateY(10);

        startBut.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                observableListPoint = FXCollections.observableArrayList();
                gc = canvas.getGraphicsContext2D();
                task = new DrawerTask(observableListPoint);
                task.setOnSucceeded(new EventHandler<WorkerStateEvent>()
                {
                    @Override
                    public void handle(WorkerStateEvent event)
                    {
                        double result = task.getValue();
                        System.out.println("Result: " + result);
                    }

                });
                draw(gc);
                new Thread(task).start();
            }
        }   );

        Button stopBut = new Button("Stop");
        stopBut.setTranslateX(100);
        stopBut.setTranslateY(10);

        stopBut.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                task.cancel();
            }
        }   );

        tfield = new TextField();
        tfield.setTranslateX(50);

        HBox hBox1 = new HBox();
        hBox1.setTranslateY(10);
        hBox1.getChildren().addAll(new Label("Ilosc punktow: "), tfield);

        HBox hBox3 = new HBox();
        hBox3.setTranslateX(50);
        hBox3.getChildren().addAll(startBut, stopBut);
        vBox.getChildren().addAll(hBox1, hBox3, canvas) ;
        vBox.setSpacing(10);

    }


    public static void main(String[] args)
    {
        launch(args);
    }


    private void draw(GraphicsContext gc)
    {
        BufferedImage bi = new BufferedImage(sizeXY, sizeXY,
                BufferedImage.TYPE_INT_RGB);
        for(int i=0; i<bi.getHeight();i++)
        {
            for(int j=0; j<bi.getWidth();j++)
                bi.setRGB(i,j , Color.WHITE.getRGB());
        }

        observableListPoint.addListener(new ListChangeListener<Point>()
        {
            int i = 0;
            @Override
            public void onChanged(Change<? extends Point> c)
            {
                Point point = observableListPoint.get(i);
                bi.setRGB(point.getX(), point.getY(),point.getColor().getRGB());
                if(i%1000==0)
                    gc.drawImage(SwingFXUtils.toFXImage(bi, null), 0, 0);
                i++;
            }
        });
    }
}
