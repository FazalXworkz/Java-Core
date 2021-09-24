class ToothBrushRunner{

public static void main(String[] vals){

ToothBrush brush1 = new ToothBrush();

String brand1 = brush1.brand;
String color1 = brush1.color;
boolean tongueCleaner1 = brush1.tongueCleaner;

brand1 = "Pepsodent";
color1 = "white";
tongueCleaner1 = false; 

System.out.println(brand1);
System.out.println(color1);
System.out.println(tongueCleaner1);

ToothBrush brush2 = new ToothBrush();

String brand2 = brush2.brand;
String color2 = brush2.color;
boolean tongueCleaner2 = brush2.tongueCleaner;

brand1 = "OralB";
color2 = "black";
tongueCleaner2 = true; 

System.out.println(brand1);
System.out.println(color2);
System.out.println(tongueCleaner2);

}

}