public class Main {
    public static void main (String[] args){
        System.out.println("hello world");

        triangles tatsulok;

        tatsulok = new triangles(3, "red");

        System.out.println(tatsulok.getColor());
        System.out.println(tatsulok.getSide());

        tatsulok.setColor("yellow");
        tatsulok.setSide(4);

        System.out.println(tatsulok.getColor());
        System.out.println(tatsulok.getSide());

        //SQUARES
        squares parisukat;

        parisukat = new squares(4, "blue");

        System.out.println(parisukat.getColor());
        System.out.println(parisukat.getSides());

        parisukat.setColor("Teal");
        parisukat.setSides(8);

        System.out.println(parisukat.getColor());
        System.out.println(parisukat.getSides());

    }
}