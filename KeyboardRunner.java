class KeyboardRunner{

public static void main(String[] keys){

Keyboard keyboard = new Keyboard("wireless", "black", false);
System.out.println("KeyBoard 1\ntype-"+keyboard.type+"\nColor-"+keyboard.color+"\nBack Light-"+keyboard.backLight);

Keyboard keyboard1 = new Keyboard("wired", "white", true);
System.out.println("KeyBoard 2\ntype-"+keyboard1.type+"\nColor-"+keyboard1.color+"\nBack Light-"+keyboard1.backLight);

}

}