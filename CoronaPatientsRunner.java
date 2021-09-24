class CoronaPatientsRunner{

public static void main(String[] vals){

String name = vals[0];
int age = Integer.parseInt(vals[1]);
String from = vals[2];
String admitted = vals[3];
String admittedTo = vals[4];
int infectedDays = Integer.parseInt(vals[5]);
String alive = vals[6];
String discharge = vals[7];

CoronaPatients.getCoronaPatients(name,age,from,admitted,admittedTo,infectedDays,alive,discharge);

}

}