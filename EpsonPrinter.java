/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerland;

/**
 *
 * @author Josh
 */
public class EpsonPrinter extends Computer implements Printer{
    
    public EpsonPrinter(String name, int storage) {
        super(name, storage);
        this.setType("Linux");
    }
 
    @Override
    public void Print(String jobName, int pages) {
        for(int i = 0; i < pages; i++){
          System.out.println("Printing page " + (i+1) + " of " + jobName);
        }
    }

    @Override
    public void Scan(Computer myComp, String jobName, int pages) {
      myComp.Save(pages*5);
        System.out.println("Scanning " + pages + " of " + jobName + " to "+ myComp.getName());
    }


}
