import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.Save(new Customer(1, "Ahmet Can", "Özaslan", new Date(1996,1,3), "12345678970"));
		
	}

}
