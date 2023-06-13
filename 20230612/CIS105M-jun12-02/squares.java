public class squares {
    //attributes
    private int sides;
    private String color;
    
    //constructors
    public squares(int sides, String color) {
        this.sides = sides;
        this.color = color;
    }
    //getters == have returns
    public int getSides(){
        return this.sides;
    }

    public String getColor() {
        return this.color;
    }
    //setters
    public void setSides(int x) {
        this.sides = x;
    }

    public void setColor(String x) {
        this.color = x;
    }


    //methods
    public void sayHelloSquare() {
        System.out.println("Square Hello");
    }

}