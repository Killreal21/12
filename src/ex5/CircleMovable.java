package ex5;

public class CircleMovable extends Circle implements Movable{

    public CircleMovable(Point center, double radius) {
        super(center, radius);
    }

    @Override
    public void move(int x, int y) {
       try {
           ((PointMovable) this.getCenter()).move(x, y);
       }
       catch (ClassCastException e){


           // тупая логика чере геты сеты
           e.printStackTrace();
           System.out.println("Я упаль");
       }
        //this.getCenter();
        //this.getRadius();
    }
}
