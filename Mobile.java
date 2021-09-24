class Mobile{

public static void main(String[] vals){

String brand = vals[0];
String color = vals[1];
String model = vals[2];
int price = Integer.parseInt(vals[3]);
int quantity = Integer.parseInt(vals[4]);
int imei = Integer.parseInt(vals[5]);
String country = vals[6];

float total = getTotalMobilePrice(brand,color,model,price,quantity,imei,country);
System.out.println(total);

}

public static float getTotalMobilePrice(String brand,String color, String model, int price,int quantity,int imei, String country){

return price*quantity;

}

}