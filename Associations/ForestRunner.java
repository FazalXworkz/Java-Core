class ForestRunner{

	public static void main(String[] vals){
	
		Forest forest = new Forest("Bandipur","Mysore",500);
		forest.state = new State("Karnataka",25,"ChandraShekar");
		forest.state.capitalCity = new CapitalCity("Mysore",2000000,"Mysore Zoo");
		
		System.out.println(forest.name);
		System.out.println(forest.location);
		System.out.println(forest.area);
		System.out.println(forest.state.name);
		System.out.println(forest.state.noOfDistricts);
		System.out.println(forest.state.cmName);
		System.out.println(forest.state.capitalCity.name);
		System.out.println(forest.state.capitalCity.population);
		System.out.println(forest.state.capitalCity.famousFor);
		
	}

}