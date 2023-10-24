package br.com.ebac.design;

public class CompanyCarFactory extends Factory {

	@Override
	Car retrieveCar(String requestedGrade) {
		switch(requestedGrade) {
			case "A":
				return new Tesla(1000, "full", "blue");
			case "B":
				return new Audi(800, "full", "red");
			default: 
				System.out.println("the requested car was unfortunately not available.");
				return null;
		}
	}

}
