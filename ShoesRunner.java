class ShoesRunner{

public static void main(String[] vals){

Shoes shoe1 = new Shoes();

String type1 = shoe1.type;
String color1 = shoe1.color;
String ankleLength1 = shoe1.ankleLength;

type1 = "formal";
color1 = "brown";
ankleLength1 = "low"; 

System.out.println(type1);
System.out.println(color1);
System.out.println(ankleLength1);

Shoes shoe2 = new Shoes();

String type2 = shoe2.type;
String color2 = shoe2.color;
String ankleLength2 = shoe2.ankleLength;

type2 = "casual";
color2 = "black";
ankleLength2 = "midf"; 

System.out.println(type2);
System.out.println(color2);
System.out.println(ankleLength2);

}

}