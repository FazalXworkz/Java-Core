class Starter{

	public static void main(String[] args){
	
		Curtain curt = new Curtain();
		curt.setHeight(7.5f);
		curt.setColor("Blue");
		curt.setType("window");
		curt.setMaterial("cotton");
		curt.setBrand("Some Brand");
		
		float height = curt.getHeight();
		String color = curt.getColor();
		String type = curt.getType();
		String material = curt.getMaterial();
		String brand = curt.getBrand();
		
		System.out.println(height);
		System.out.println(color);
		System.out.println(type);
		System.out.println(material);
		System.out.println(brand);
	
	}

}