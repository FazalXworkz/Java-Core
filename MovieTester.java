class MovieTester{

public static void main(String[] args){

//String[] actors = Actor.getActorsByMovieName("KGF");
//System.out.println(actors);
//System.out.println(actors.length);
//System.out.println(actors[0]);
//System.out.println(actors[1]);
//System.out.println(actors[2]);



String[] actors = Actor.getActorsByMovieName(args[1]);    /

if(actors !=null){
	System.out.println(actors);
System.out.println(actors.length);
System.out.println(actors[0]);
System.out.println(actors[1]);
System.out.println(actors[2]);
}



}

}