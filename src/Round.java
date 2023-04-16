public class Round {
    static double konst = 3.14;
    private double radius;
    private double square;
    private double length;

    public Round(double radius) {
        this.radius = radius;
    }
    public void calculater(){
        square = konst*(double) Math.sqrt(radius*2);
        length = 2*konst*radius;
        System.out.println("Square = " + square);
        System.out.println("Length = " + length);
    }
}
