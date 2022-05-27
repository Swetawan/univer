/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author 18776
 */
public class DrawRect extends Rectangle{
    String outcolor;
    public DrawRect(int x1,int x2, int y1, int y2, String outcolor ){
        super(x1,x2,y1,y2);
       this.outcolor=outcolor; 
    }
     public DrawRect(int wight, int height, String outcolor ){
        super(wight,height);
       this.outcolor=outcolor; 
    }
     public DrawRect(){
         super();
         this.outcolor="";
     }
     String draw(String outcolor ){
         this.outcolor=outcolor;
         return outcolor;
     }
}
