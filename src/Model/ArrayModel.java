//
package Model;
import java.util.Random;

public class ArrayModel {
    
    static int Size = 20;
    
    int[] defaultArray = new int[20];
    
    int[] arrayEven = new int[20];
    int[] arrayOdd = new int[20];
    
    int defCounter = 0;
    int evenCounter = 0;
    int oddCounter = 0;

    Random random = new Random();

    public int getSize(){
        return Size;
    }
    public void setDefaultArray(int number) {
        
        this.defaultArray[defCounter] = number;
        defCounter++;
    }
    
    
    public int getdefaultCounter(){
        
        return defCounter;
    }
    
    //-----------------------------------------------//
    // Toma el array principal y separa los valores  //
    // guardandolos en el array correspondiente      //
    // (Par / Impar).                                //
    //-----------------------------------------------//
    public void setArrayTables(){
        
        for (int i=0; i<defCounter; i++) {
            if(defaultArray[i] %2 == 0){
                arrayEven[evenCounter] = defaultArray[i];
                evenCounter++;
            }
            else{
                arrayOdd[oddCounter] = defaultArray[i];
                oddCounter++;
            }
        }
    }
    
    public void setRandomDefault(){
        for(int i=0; i<Size; i++){
            defaultArray[i] = random.nextInt(99);
        }

        for (int i=0; i<Size; i++) {
            if(defaultArray[i] %2 == 0){
                arrayEven[evenCounter] = defaultArray[i];
                evenCounter++;
            }
            else{
                arrayOdd[oddCounter] = defaultArray[i];
                oddCounter++;
            }
        }        
    }
    
    //[X]
    public void showDef(){
        
        for (int i : defaultArray) {
            System.out.print("["+ i +"]");
        }
    }
    
    
    // [Retorna la cantidad de numeros PARES guardados]
    public int getEvenCounter(){
        return evenCounter;
    }
    // [Retorna la cantidad de numeros IMPARES guardados]
    public int getOddCounter(){
        return oddCounter;
    }
    
    public int getArrayEven(int index){
        return arrayEven[index];
    }
    
    public int getArrayOdd(int index){
        return arrayOdd[index];
    }
    
    
    public void resetValues(){
        
        for (int i=0; i<defCounter; i++) {
            defaultArray[i] = 0;
        }
        for(int i=0; i<evenCounter; i++){
            arrayEven[i] = 0;
        }
        for(int i=0; i<oddCounter; i++){
            arrayOdd[i] = 0;
        }       
        
        defCounter = 0;
        oddCounter = 0;
        evenCounter = 0;       
    }
    
}
