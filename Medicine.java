class Medicine{

public static void main(String[] vals){

String name = vals[0];
String company = vals[1];
float price = Float.parseFloat(vals[2]);
int quantity = Integer.parseInt(vals[3]);

float total = getTotalMedicinePrice(name,company,price,quantity);
System.out.println(total);

}

public static float getTotalMedicinePrice(String name,String company, float price, int quantity){

return price*quantity;

}

}