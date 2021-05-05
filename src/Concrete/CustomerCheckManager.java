package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

}
