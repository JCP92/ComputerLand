/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerland;

import java.util.Arrays;

/**
 *
 * @author Josh
 */
public abstract class Computer implements ElectronicDevice{
    private String name;
    private int storage;
    private Printer printer;
    private String Type;
    
    public Computer(String name, int memory) {
        this.name = name;
        this.storage = memory;
    }
    
    public void setType(String type) { Type = type; }
    
    public void addPrinter(Printer newPrinter){ printer = newPrinter; }

    @Override
    public String getSummary() { return getName()+"("+ getOperatingSystem()+ ") with storage = " + getStorage(); }
    
    public void Scan(String jobName, int pages){
        printer.Scan(this, jobName, pages);
    }

    public void Print(String jobName, int pages){
        printer.Print(jobName, pages);
    }
    
    public String getName() { return name; }

    public int getStorage() { return storage; }
    
    public void Save(int num){ storage -= num; }
    
    public String getOperatingSystem() { return Type; };
   
}
   
