class BedSheetRunner{

public static void main(String[] vals){

BedSheet bedSheet1 = new BedSheet();

String type1 = bedSheet1.type;
String color1 = bedSheet1.color;
String material1 = bedSheet1.material;

type1 = "single bed";
color1 = "white";
material1 = "Cotton"; 

System.out.println(type1);
System.out.println(color1);
System.out.println(material1);

BedSheet bedSheet2 = new BedSheet();

String type2 = bedSheet2.type;
String color2 = bedSheet2.color;
String material2 = bedSheet2.material;

type1 = "king bed";
color2 = "black";
material2 = "semi-cotton"; 

System.out.println(type1);
System.out.println(color2);
System.out.println(material2);

}

}