import processing.core.PApplet;
import java.util.*;
/** 
   * This program draws a flower and displays the time. The flower will appear in a random place every time the program is run. The background will appear either dark blue or light blue, depending on the flower position.
   * Author: Ethan Rodrigues 
   */
public class Sketch extends PApplet {
  // time variables
  Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("EST"));
  String hour = String.format("%02d",cal.get(Calendar.HOUR));
  String minute = String.format("%02d",cal.get(Calendar.MINUTE));
  String second = String.format("%02d",cal.get(Calendar.SECOND));

  /* I tried using the code below for the time, but it did not allow me to set the proper time zone so I used another resource that I found on google for the code for the time
  int s = second();  
  int m = minute();  
  int h = hour()-5;   
  */
  
  public void settings() {
    size(400, 400);
  }
  // variables for flower
 float horizontalDistance = 400;
 float verticalDistance = 400;
 float xValue = random(0, horizontalDistance);
 float yValue = random(0, verticalDistance); 

  public void setup() {
    // background color. If y value is greater than 200, it is light blue. If not, it is dark blue
    if (yValue >=200){
      background (159, 237, 233);
    }
    else {
      background (159, 186, 237);
    }
  }

  public void draw() {

    // display text to show the time
    fill(235, 97, 52);
    size(400, 400);
    textSize(30);
    text(hour + ":" + minute + ":" + second, 20, 35); 
    //text(h + ":" + m + ":" + s, 20, 35); 

   fill(201, 24, 0);

    // petals
    ellipse(xValue - 35, yValue + 35, 70, 70);
    ellipse(xValue - 35, yValue - 35, 70, 70);
    ellipse(xValue + 35, yValue - 35, 70, 70);
    ellipse(xValue + 35, yValue + 35, 70, 70);

    // Main Petal
    fill(69, 99, 54);
    ellipse(xValue, yValue, 70, 70);
  }

  
  
}