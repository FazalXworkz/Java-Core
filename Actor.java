class Actor{

public static String[] getActorsByMovieName(String movieName){
	
	System.out.println(movieName);

if(movieName.equals("KGF")){
	
	System.out.println("after using equals in the if condition");

String[] acts = {
	"Yash","Srinidhi","Anathnag"};
	
return acts;

}

return null;
}

}