/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempGui;

/**
 *
 * @author Nick
 */
public class Calculation {
    public static String calcToC(String input){
        String in = input;
        int inputTemp = Integer.parseInt(in);
        int convertedToC = (inputTemp-32)*5/9;
        return convertedToC+"";
    }
}
