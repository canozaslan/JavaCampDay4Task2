package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

}
