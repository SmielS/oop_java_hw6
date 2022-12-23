package org.example;



import org.example.controller.FigureController;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        FigureController controller = new FigureController();
        controller.createCircle(10.0);
        controller.createRectangle(30.0, 20.0);
        controller.createSquare(20.0);
        controller.createTriangle(10.0, 10.0, 10.0);
        String out = "\nПериметр всех фигур: " + controller.getAllPerimeters() +
                "\nДлина окружности всех фигур: " + controller.getAllLength() +
                "\nПлощадь всех фигур: " + controller.getAllAreas();
        Logger log = Logger.getLogger(Main.class.getName());
        log.info(out);
    }
}