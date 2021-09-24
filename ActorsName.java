class ActorsName{

public static void main(String[] vals){

String movie = "Lunch Box";
	String[] actors= getActors(movie);
	for(int i=0;i<actors.length;i++){
		System.out.println(actors[i]);
	}
	

}

public static String[] getActors(String movie){

	if(movie == "La La Land"){
		String[] actorsName = {
			"Ryan Gosling","Emma Stone"
		};
		return actorsName;
	}
	
	if(movie == "Tamasha"){
		String[] actorsName = {
			"Ranbir Kapoor","Deepika Padokon"
		};
		return actorsName;
	}
	
	if(movie == "Lunch Box"){
		String[] actorsName = {
			"Irfan Khan","Nawazuddin Siddique", "Nimrat Kaur"
		};
		return actorsName;
	}
	
	
	String[] noMatch = {
		"No Match"
	};
	return noMatch;
}

}