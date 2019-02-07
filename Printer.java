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
public interface Printer extends ElectronicDevice{
    
    public abstract void Print(String jobName, int pages);
    public abstract void Scan(Computer myComp, String jobName, int pages);
}
