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
public class DellDesktop extends Computer{
    public DellDesktop(String name, int memory) {
        super(name, memory);
        this.setType("Windows");

    }

    @Override
    public String getSummary() {
       return getName()+ "(runs"+ getOperatingSystem() + ")"+ " with storage = "+ getStorage();
    }


}
