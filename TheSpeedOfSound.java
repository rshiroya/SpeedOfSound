import javax.swing.JOptionPane;

import java.lang.Math;

/** * * @author  */

public class TheSpeedOfSound {
    public static double time;       

   public static void main(String[] args) {       

             String type = JOptionPane.showInputDialog("What material is the sound traveling through? Type air, water or steel");       

            double distance = Integer.parseInt(JOptionPane.showInputDialog("What is the distance that a sound wave will travel through the " + type + "? Enter a number."));               

              if (type.equals("air"))  {           

               time = distance/1100;                   

               } else if (type.equals("water"))  {           

                time = distance/4900;                   

               } else if (type.equals("metal"))  {           

                time = distance/16400;       

                }               

               double rounded = Math.round(time * 100.0) / 100.0;       

               String timeString = Double.toString(rounded);            

               JOptionPane.showMessageDialog(null, "The time the sound wave will be inside the object is " + timeString + " seconds.");   

   }    

}

