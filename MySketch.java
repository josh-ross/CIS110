/*
 * Name: Josh Ross
 * PennKey: joshross
 * Recitation: ???
 * 
 * Execution: java MySketch
 * 
 * This program creates a grenn field with the Penn P at the center
 */

//ADD TRIANGLES THAT ARE LAX GOALS
public class MySketch {
    public static void main(String[] args) {
        //sets the size of the canvas
        PennDraw.setCanvasSize(500, 500);
        PennDraw.clear();
        PennDraw.setPenColor(0, 190, 0); // draw a green field
        PennDraw.filledRectangle(0.5, 0.5, 1, 1);
        PennDraw.setPenColor(255, 255, 255);
        PennDraw.line(0, .5, 1, .5);
        PennDraw.line(0, .25, 1, .25);
        PennDraw.line(0, .75, 1, .75);
        PennDraw.line(0, 0, 1, 0);
        PennDraw.line(0, 1, 1, 1);
        PennDraw.line(0, 0, 0, 1);
        PennDraw.line(1, 0, 1, 1);
        //PennDraw.setPenColor(PennDraw.RED);
        //drawing the base of the P
        //PennDraw.filledRectangle(.5, .35, .075, .03);
        PennDraw.setPenColor(PennDraw.BLUE);
        //drawing the vertical shaft of the P
        PennDraw.filledRectangle(.45, .5, .025, .12);
        PennDraw.setPenColor(PennDraw.RED);
        //drawing the top horizontal of the shaft
        PennDraw.filledRectangle(.52, .615, .095, .01);
        //drawing the bottom horizontal of the P
        PennDraw.filledRectangle(.52, .5, .095, .01);
        PennDraw.setPenColor(PennDraw.BLUE);
        //drawing the smaller vertical of the P
        PennDraw.filledRectangle(.615, .5575, .01, .0675);
        PennDraw.setPenColor(255, 255, 255);
        //Beginning to draw the 5 (left side)
        PennDraw.line(.01, .57, .07, .57);
        PennDraw.line(.01, .57, .01, .5);
        PennDraw.line(.07, .5, .07, .43);
        PennDraw.line(.07, .43, .01, .43);
        //Beginning to draw the 0 (left side)
        PennDraw.line(.09, .57, .16, .57);
        PennDraw.line(.09, .57, .09, .43);
        PennDraw.line(.09, .43, .16, .43);
        PennDraw.line(.16, .57, .16, .43);
        //Beginning to draw the 0 (right side)
        PennDraw.line(.99, .57, .92, .57);
        PennDraw.line(.92, .57, .92, .43);
        PennDraw.line(.92, .43, .99, .43);
        PennDraw.line(.99, .57, .99, .43);
        //Beginning to draw the 5 (right side)
        PennDraw.line(.84, .57, .9, .57);
        PennDraw.line(.84, .57, .84, .5);
        PennDraw.line(.9, .5, .9, .43);
        PennDraw.line(.9, .43, .84, .43);
        //drawing the white cirlce
        PennDraw.circle(.5, .5, .2);
    }
}
