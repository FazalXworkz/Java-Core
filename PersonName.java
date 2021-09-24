class PersonName{

public static void main(String[] vals){

int date = 15;
int month = 10;
int year = 1931;

String person = getPersonName(date,month,year);
System.out.println(person);

}

public static String getPersonName(int date,int month,int year){

	if(date == 17 && month == 1 && year == 1942){
		return "Mohammed Ali";
	}

	if(date == 20 && month == 11 && year == 1929){
		return "Milkha Singh";
	}
	
	if(date == 15 && month == 10 && year == 1931){
		return "A.P.J Abdul Kalam";
	}

	return "No match";
}

}