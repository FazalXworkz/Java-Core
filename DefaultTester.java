class DefaultTester{

public static void main(String[] vals){

System.out.println(Default.intValue+":-integer");
System.out.println(Default.shortValue+":-short");
System.out.println(Default.byteValue+":-byte");
System.out.println(Default.longValue+":-long");
System.out.println(Default.floatValue+":-float");
System.out.println(Default.doubleValue+":-double");
System.out.println(Default.charValue+":-character");
int charAscii = Default.charValue;
System.out.println(charAscii+":-character Ascii");
System.out.println(Default.boolValue+":-boolean");
System.out.println(Default.stringValue+":-String");
System.out.println(Default.intClass+":-Integer class");

}

}