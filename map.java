package java_1;

public class map {
class Address{
	private String country;
	private String province;
	private String city;
	private String street;
	private String zipcode;
	public Address(String country, String province, String city, String street, String zipcode) {
		this.country=country;
		this.province=province;
		this.city=city;
		this.street=street;
		this.zipcode=zipcode;
	}
	
	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province=province;
	}
	
	public String getCity(){
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street=street;
	}
	
	public String getZipcode() {
		return this.zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode=zipcode;
	}
	
	
	
	public void print()
	{
		System.out.println("����:"+this.country+"\n"+"ʡ��:"+this.province+"\n"+"����:"+this.city+"\n"+"�ֵ�:"+this.street+"\n"+"�ʱ�:"+this.zipcode);
	}
}
public class Test1{
	public void main(String args[]){
		Address add=new Address("�й�","����","�人","����·","430200");
		add.print();
	}
}
}
