/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 * * @author 18776
 *
 *
 */
public class ColoredRect extends DrawRect {

    String incolor;

    public ColoredRect(int x1, int x2, int y1, int y2, String outcolor, String incolor) {
        super(x1, x2, y1, y2, outcolor);
        this.incolor = incolor;
    }

    public ColoredRect(int wight, int height, String outcolor, String incolor) {
        super(wight, height, outcolor);
        this.incolor = incolor;
    }

    public ColoredRect() {
        super();
        this.incolor = "";
    }

    String draw(String outcolor, String incolor) {
        this.outcolor = outcolor;
        this.incolor = incolor;
        System.out.println(this.outcolor + this.incolor);
        return outcolor + incolor;
    }

}
