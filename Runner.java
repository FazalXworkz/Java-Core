class Runner{

public static void main(String[] values){

//PrintNameEmail.printName();
//PrintNameEmail.printEmail();
//PrintNameEmail.printName("Fazal");
//PrintNameEmail.printEmail("mdfazalkhan.xworkz@gmail.com");
//YourFavs.favActor();
//YourFavs.favMovie();
//YourFavs.favPlace();
//YourFavs.favCountry();
//YourFavs.jobRole();

//CallTwentyMethods.messageOne();
//CallTwentyMethods.messageTwo();
//CallTwentyMethods.messageThree();
//CallTwentyMethods.messageFour();
//CallTwentyMethods.messageFive();
//CallTwentyMethods.messageSix();
//CallTwentyMethods.messageSeven();
//CallTwentyMethods.messageEight();
//CallTwentyMethods.messageNine();
//CallTwentyMethods.messageTen();
//CallTwentyMethods.messageEleven();
//CallTwentyMethods.messageTwelve();
//CallTwentyMethods.messageThirteen();
//CallTwentyMethods.messageFourteen();
//CallTwentyMethods.messageFifteen();
//CallTwentyMethods.messageSixteen();
//CallTwentyMethods.messageSeventeen();
//CallTwentyMethods.messageEighteen();
//CallTwentyMethods.messageNineteen();
//CallTwentyMethods.messageTwenty();

String[] companyNames = {
	"Google","Apple","Walmart","Amazon","TCS","TechMahindra","Oracle","Accenture"
};
String[] computerBrands = {
	"HP","Dell","MacBook","Lenovo"
};
String[] mobileBrands = {
	"Nokia","Iphone","Samsung","OnePlus"
};
String[] iplTeams = {
	"DP","CSK","KKR","MI","RR","SRH","PK","RCB"
};


MethodsWithReturnType.companyName(companyNames);
MethodsWithReturnType.computerBrand(computerBrands);
String mobileBrand = MethodsWithReturnType.mobileBrand(mobileBrands);
System.out.println(mobileBrand);
String iplTeam = MethodsWithReturnType.iplTeam(iplTeams);
System.out.println(iplTeam);



}

}