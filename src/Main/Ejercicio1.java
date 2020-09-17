//
package Main;

import Controller.Control;
import Model.ArrayModel;
import View.GUI;

/**
 *
 * @author Carlos_Who
 */

public class Ejercicio1 {

    public static void main(String[] args) {
        
        GUI gui = new GUI();
        ArrayModel arrayModel = new ArrayModel();
        Control control = new Control(gui, arrayModel);
        gui.setVisible(true);
    }    
}
