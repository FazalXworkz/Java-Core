class PrimeMinisterRunner{

public static void main(String[] vals){

String name = vals[0];
String country = vals[1];
int age = Integer.parseInt(vals[2]);
String maritalStatus = vals[3];
String alive = vals[4];
int duration = Integer.parseInt(vals[5]);

PrimeMinister.getPrimeMinisterName(name,country,age,maritalStatus,alive,duration);

}

}