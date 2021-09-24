class ChatRunner{

public static void main(String[] vals){

Chat chat1 = new Chat();

String dish1 = chat1.dish;
String spicy1 = chat1.spicy;
String sweet1 = chat1.sweet;

dish1 = "pani puri";
spicy1 = "medium";
sweet1 = "medium"; 

System.out.println(dish1);
System.out.println(spicy1);
System.out.println(sweet1);

Chat chat2 = new Chat();

String dish2 = chat2.dish;
String spicy2 = chat2.spicy;
String sweet2 = chat2.sweet;

dish2 = "Dahi Bhalla";
spicy2 = "Medium";
sweet2 = "low"; 

System.out.println(dish1);
System.out.println(spicy2);
System.out.println(sweet2);

}

}