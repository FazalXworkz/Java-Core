class Converter{

public static void main(String[] vals){

String acre = "250.23";
double wrappedAcre = Double.parseDouble(acre);
System.out.println(wrappedAcre);

String rupees = "230.50";
double wrappedRupees = Double.parseDouble(rupees);
System.out.println(wrappedRupees);

int mangoPrice = 100;
Integer wrappedMangoPrice = Integer.valueOf(mangoPrice);
System.out.println(wrappedMangoPrice);

String gender = "Male";
char wrappedGender = gender.charAt(0);
System.out.println(wrappedGender);

}

}