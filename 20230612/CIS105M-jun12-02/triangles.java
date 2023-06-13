public class triangles {
    private int side;
    private String color;

    //contructors
    public triangles(int side, String color) {
        this.side = side;
        this.color = color;
    }

    //getters == may return
    public int getSide() {
        return this.side;
    }

    public String getColor() {
        return this.color;
    }

    //setters = void
    public void setSide(int x) {
        this.side = x;
    }

    public void setColor(String x) {
        this.color = x;
    }

    //simple print pemthod
    public void sayHi() {
        System.out.println("Say hi");
    }
}