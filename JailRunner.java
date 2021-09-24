class JailRunner{

public static void main(String[] vals){

int noOfCells = 50;
int noOfCriminals = 100;

Jail jail = new Jail(noOfCells,noOfCriminals);

System.out.println(jail.name);
System.out.println(jail.location);
System.out.println(jail.noOfCells);
System.out.println(jail.noOfCriminals);

}

}