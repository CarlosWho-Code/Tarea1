//
package Controller;

import Model.ArrayModel;
import View.GUI;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Control extends MouseAdapter{
    
    private GUI gui;
    private ArrayModel arrayModel;
    String even_List = "";
    String odd_List = "";
    
    
    public Control(GUI gui, ArrayModel arrayModel){
        this.gui = gui;
        this.arrayModel = arrayModel;

        gui.Button_Add.addMouseListener((this));
        gui.Txt_Number.addMouseListener((this));
        gui.Button_Clean.addMouseListener((this));
        gui.Button_Generate.addMouseListener((this));
    }

    public void startSetup(){
        
    }

     @Override
    public void mouseClicked(MouseEvent mevt) {
        Object clicked = mevt.getSource();
        
        //----------------------//
        //   TextFiel - Click   //
        //----------------------//         
        if(clicked == gui.Txt_Number){
            
            gui.Txt_Number.setText("");
        }


        //-------------------//
        //   BOTON - Add     //
        //-------------------//        
        if(clicked == gui.Button_Add){
            gui.Button_Generate.setEnabled(false);
            
            arrayModel.setDefaultArray(Integer.parseInt(gui.Txt_Number.getText()));
            
            
            if(arrayModel.getdefaultCounter() == arrayModel.getSize()){
                
                arrayModel.setArrayTables();  
                
                for(int i=0; i<arrayModel.getEvenCounter(); i++){
                    even_List = "<html>"+ even_List + "<br>" + String.valueOf(arrayModel.getArrayEven(i) + "<html>");
                    gui.Label_Even.setText(even_List);
                                  
                }               
                for(int i=0; i<arrayModel.getOddCounter(); i++){
                    odd_List = "<html>"+ odd_List + "<br>" + String.valueOf(arrayModel.getArrayOdd(i) + "<html>");
                    gui.Label_Odd.setText(odd_List);
                }
                gui.Button_Generate.setEnabled(true);
            }
            
            gui.Txt_Number.setText("");
        }
        
        if(clicked == gui.Button_Generate){
            gui.Label_Even.setText("");
            gui.Label_Odd.setText("");
            even_List = "";
            odd_List = "";
            arrayModel.resetValues();

            arrayModel.setRandomDefault();
            
            for(int i=0; i<arrayModel.getEvenCounter(); i++){
                even_List = "<html>"+ even_List + "<br>" + String.valueOf(arrayModel.getArrayEven(i) + "<html>");
                gui.Label_Even.setText(even_List);

            }

            for(int i=0; i<arrayModel.getOddCounter(); i++){
                odd_List = "<html>"+ odd_List + "<br>" + String.valueOf(arrayModel.getArrayOdd(i) + "<html>");
                gui.Label_Odd.setText(odd_List);
            }
            
            arrayModel.resetValues();
        }
        
        
        

        //-------------------//
        //   BOTON - Clean   //
        //-------------------//         
        if(clicked == gui.Button_Clean){
            gui.Button_Generate.setEnabled(true);
            gui.Label_Even.setText("");
            gui.Label_Odd.setText("");
            even_List = "";
            odd_List = "";
            arrayModel.resetValues();
        }
    }
    
    




   
    
    
}
