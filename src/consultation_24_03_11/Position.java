package consultation_24_03_11;

public class Position {

    private int x;
    private int y;

    public void move(int distance, Directions direction) {
        switch (direction) {
            case UP:
                this.y+=distance;
                break;
            case DOWN:
                this.y-=distance;
                break;
            case LEFT:
                this.x-=distance;
                break;

            case RIGHT:
                this.x+=distance;
                break;
        }
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
