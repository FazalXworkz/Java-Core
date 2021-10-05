class Forest{

	String name;
	String location;
	float area;
	State state;
	
	Forest(float area){
		this.area = area;
	}
	
	Forest(String name,String location, float area){
		
		this(area);
		this.name = name;
		this.location = location;
	
	}
	
	Forest(){}

}