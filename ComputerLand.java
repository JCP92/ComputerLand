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
public class ComputerLand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computer mac = new AppleMacbook("MyMac", 1000);
	Computer dell = new DellDesktop("MyDell", 500);
	Printer epson = new EpsonPrinter("MyEpson", 2);
                                
        PowerSource source = new PowerSource();
				
	source.attach(mac);
	source.attach(dell);
	source.attach(epson);
				
	mac.addPrinter(epson);
	dell.addPrinter(epson);
				
	mac.Scan("Passport application", 10);
        mac.Print("Story", 5);
				
	dell.Scan("Taxes", 25);
	dell.Print("License areement", 2);

        source.printInventory();						
			
    }
    
}
