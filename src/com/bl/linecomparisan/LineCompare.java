package com.bl.linecomparisan;

public class LineCompare {


    static boolean callEqualsMethod(String line1, String line2){
        System.out.print("RESULT OF equals method --> ");
        return line1.equals(line2);
    }

    public static void main(String[] args) {
        System.out.println("LINE COMPARISON CODE");

        double fX1 = 12, fX2 = 7;
        double fY1 = 7, fY2 = 9;

        double sX1 = 11, sX2 = 32;
        double sY1 = 16, sY2 = 17;

        double fxValueOfSquare = Math.pow((fX2 - fX1), 2);
        double fyValueofSquare = Math.pow((fY2 - fY1), 2);
        double lengthOfLine1 = Math.sqrt(fxValueOfSquare + fyValueofSquare);
        System.out.println("Line1 = " + lengthOfLine1);

        double sxValueOfSquare = Math.pow((sX2 - sX1), 2);
        double syValueofSquare = Math.pow((sY2 - sY1), 2);
        double lengthOfLine2 = Math.sqrt(sxValueOfSquare + syValueofSquare);
        System.out.println("Line2 = " + lengthOfLine2);

        String line1 = String.valueOf(lengthOfLine1);
        String line2 = String.valueOf(lengthOfLine2);
        boolean equalsResult = callEqualsMethod(line1, line2);
        if (equalsResult != true) {
            System.out.println("Lines are not equal");
        } else {
            System.out.println("Lines are equal");
        }


    }}
