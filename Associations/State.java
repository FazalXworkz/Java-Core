class State{

	String name;
	int noOfDistricts;
	String cmName;
	CapitalCity capitalCity;
	
	State(String cmName){
		this.cmName = cmName;
	}
	
	State(String name,int noOfDistricts,String cmName){
	
		this(cmName);
		this.name = name;
		this.noOfDistricts = noOfDistricts;
	
	}
	
	State(){}

}