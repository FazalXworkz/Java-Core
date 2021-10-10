class Curtain{

	private float height;
	private String color;
	private String type;
	private String material;
	private String brand;
	
	void setHeight(float height){
		this.height = height;
	}
	
	void setColor(String color){
		this.color = color;
	}
	
	void setType(String type){
		this.type = type;
	}
	
	void setMaterial(String material){
		this.material = material;
	}
	
	void setBrand(String brand){
		this.brand = brand;
	}
	
	float getHeight(){
		return this.height;
	}
	
	String getColor(){
		return this.color;
	}
	
	String getType(){
		return this.type;
	}
	
	String getMaterial(){
		return this.material;
	}
	
	String getBrand(){
		return this.brand;
	}

}