package br.com.ebac.design;

public class App {

	public static void main(String[] args) {
		Customer customerOne = new Customer("B", true);
		Factory factory = getCarFactory(customerOne);

	}

	private static Factory getCarFactory(Customer customer) {
		if(customer.hasCompanyContract()) {
			return new CompanyCarFactory();
		}else {
			return new CompanyCarFactory();
		}
	}

}
