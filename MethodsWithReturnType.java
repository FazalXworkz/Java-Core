class MethodsWithReturnType{

public static String nameVehicleCompany(String name,String vehicle,String company){
	return company;
}

public static void companyName(String[] companyNames){
	for(int i=0;i<companyNames.length;i++){
		System.out.println(companyNames[i]);
	}
	System.out.println(companyNames[0]);
	System.out.println(companyNames[1]);
}

public static void computerBrand(String[] computerBrands){
	for(int i=0;i<computerBrands.length;i++){
		System.out.println(computerBrands[i]);
	}
}

public static String mobileBrand(String[] mobileBrands){
	return mobileBrands[0];
}

public static String iplTeam(String[] iplTeams){
	return iplTeams[iplTeams.length-1];
}

}