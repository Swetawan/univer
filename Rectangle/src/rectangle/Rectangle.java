/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

import java.util.*;
import java.io.*;

public class Rectangle {

    int x1, x2;
    int y1, y2;

    public Rectangle(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Rectangle(int wight, int height) {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = wight;
        this.y2 = height;
    }

    public Rectangle() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
    }

    public int[] rect_print() {
        System.out.println(this.x1 + " " + this.x2 + " " + this.y1 + " " + this.y2);
        int[] result = new int[4];
        result[0] = this.x1;
        result[1] = this.x2;
        result[2] = this.y1;
        result[3] = this.y2;
        return result;
    }

    public void move(int dx, int dy) {
        this.x1 += dx;
        this.x2 += dx;
        this.y1 += dy;
        this.y2 += dy;

    }

    public void minSqure(Rectangle r, Rectangle rr) {
        int s1, s2;
        s1 = Math.abs((r.x2 - r.x1) * (r.y2 - r.y1));
        s2 = Math.abs((rr.x2 - rr.x1) * (rr.y2 - rr.y1));
        if (s1 > s2) {
            System.out.println(s1);

        } else {
            System.out.println(s2);
        }
    }

    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle(2, 4, 5, 2);
        Rectangle rec2 = new Rectangle(4, 4);
        Rectangle r = new Rectangle();
        r.rect_print();
        r.move(1, 1);
        r.rect_print();
        rec1.rect_print();
        rec2.rect_print();
        r.minSqure(rec1, rec2);
        System.out.println("границы прямоугольника");
        DrawRect D = new DrawRect(2, 5, 6, 8, "черные");
        D.rect_print();
        System.out.println(D.outcolor);
        DrawRect DD = new DrawRect(2, 5, "белые");
        D.rect_print();
        System.out.println(DD.outcolor);
        System.out.println("цвета прямоугольника");
        ColoredRect C = new ColoredRect(2, 4, 7, 9, "черный", "белый");
        C.rect_print();
        System.out.println(C.outcolor + " " + C.incolor);
        C.draw("зеленый ", " желтый");

    }

}
