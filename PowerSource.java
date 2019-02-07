
package computerland;

import java.util.Arrays;


public class PowerSource {
    
    private ElectronicDevice[] devices = new ElectronicDevice[6];
    private int count = 0;
    public void attach(ElectronicDevice name){
        devices[count] = name;
        count++;
    }

    
    public void printInventory() { 
        System.out.println("=== INVENTORY ===");
        for(int i = 0; i < count; i++){
            System.out.println( devices[i].getSummary()); 
        }
    }
}
