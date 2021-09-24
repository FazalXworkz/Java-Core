class VirusRunner{

public static void main(String[] vals){
	
	System.out.println(vals[0]);

Virus virus1 = new Virus();

String name1 = virus1.name;
boolean vaccination1 = virus1.vaccination;

name1 = "Covid19";
vaccination1 = true; 

System.out.println(name1);
System.out.println(vaccination1);

Virus virus2 = new Virus();

String name2 = virus2.name;
boolean vaccination2 = virus2.vaccination;

name1 = "Ebola";
vaccination2 = true; 

System.out.println(name1);
System.out.println(vaccination2);

}

}