package chap05;
class point {

    private int x, y;

    public point () {
        this.x = this.y = 0;
    }

    public point (int x, int y) {
        this.x = x; this.y = y;
    }
    
    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint extends point {
    
    private String color;

    public ColorPoint (int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    
    public void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}

public class Ex5_02 {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 6, "blue");
        cp.showColorPoint();
    }
}