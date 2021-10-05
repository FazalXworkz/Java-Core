class CapitalCity{

	String name;
	float population;
	String famousFor;
	
	CapitalCity(float population){
		this.population = population;
	}
	
	CapitalCity(String name,float population,String famousFor){
		this(population);
		this.name = name;
		this.famousFor = famousFor;
		
	}
	
	CapitalCity(){}

}