package com.bl.linecomparisan;

public class LineCompare {
    public static void main(String[] args) {

        System.out.println("LINE COMPARISON CODE");

        double fX1 = 6, fX2 = 7;
        double fY1 = 7, fY2 = 9;

        double sX1 = 15, sX2 = 31;
        double sY1 = 12, sY2 = 15;

        double fxValueOfSquare = Math.pow((fX2-fX1),2);
        double fyValueofSquare = Math.pow((fY2-fY1),2);
        double lengthOfLine1 = Math.sqrt(fxValueOfSquare + fyValueofSquare);
        System.out.println("Line1 = " + lengthOfLine1);

        double sxValueOfSquare = Math.pow((sX2-sX1),2);
        double syValueofSquare = Math.pow((sY2-sY1),2);
        double lengthOfLine2 = Math.sqrt(sxValueOfSquare + syValueofSquare);
        System.out.println("Line2 = " + lengthOfLine2);
    }


}
