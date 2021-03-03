package association;

public class Aggregation2 {
	public static void main(String[] args)
	{
		Address a = new Address("nzb","Telangana","India");
		Emp e = new Emp(12,"vijaya",a);
		System.out.print(e.empid+" "+e.empName);
		System.out.println(" "+a.city+" "+a.state+" "+a.country);
	}

}
class Address
{
	String city,state,country;
	Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
class Emp
{
	int empid;
	String empName;
	Address address;
	Emp(int empid,String empName,Address address)
	{
		this.empid=empid;
		this.empName=empName;
		this.address=address;
	}
}
