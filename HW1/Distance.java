public class Distance{
  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);

    double dist = Math.sqrt(x * x + y * y);

    System.out.println("distance from the point (x, y) to the origin (0, 0) is: " + dist);
    }
}
