class Actors{

public static void main(String[] vals){

String movie = "La La Land";
	String actors= getActors(movie);
	System.out.println(actors);

}

public static String getActors(String movie){

	if(movie == "La La Land"){
		String[] actorsName = {
			"Ryan Gosling","Emma Stone"
		};
		return "Ryan Gosling";
	}
	String[] noMatch = {
		"No Match"
	};
	return "No Match";
}

}