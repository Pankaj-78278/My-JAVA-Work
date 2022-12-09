package Day5_Q1;

public class ObjectCollaboration {
	
	public static void main(String[] args) {
		
		Office office = new Office();
		office.CompanyName= "MasaiSchool";
		
		
		MasaiAddress masaiAddress= new MasaiAddress();
		masaiAddress.streetNo="zilaFaridabad";
		masaiAddress.city= "Faridabad";
		masaiAddress.zipCode= 121002;
		
		System.out.println(office.CompanyName);
		office.address=masaiAddress;
		System.out.println(office.address.streetNo);
		
		System.out.println(office.address.city);
		System.out.println(office.address.zipCode);
	}

}

class Office{
	String CompanyName;
	MasaiAddress address;
	
}

class MasaiAddress{
	String streetNo;
	String city;
	int zipCode;
	
}