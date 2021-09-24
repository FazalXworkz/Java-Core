class LabRunner{

public static void main(String[] vals){

String name = "ISE Lab";
String location = "Kormangala";
int rooms = 2;

Laboratory lab = new Laboratory(name,location,rooms);
System.out.println(lab.name);
System.out.println(lab.location);
System.out.println(lab.noOfRooms);
System.out.println(lab.type);
System.out.println(lab.operators);

lab.type = LabType.ISE;
String[] operator = {
	"manju","raju","shushila"
};
lab.operators = operator;			
System.out.println(lab.name);
System.out.println(lab.location);
System.out.println(lab.noOfRooms);
System.out.println(lab.type);
System.out.println("Operators :-");
for(int i=0;i<lab.operators.length;i++){
	System.out.println(lab.operators[i]);
}

}

}