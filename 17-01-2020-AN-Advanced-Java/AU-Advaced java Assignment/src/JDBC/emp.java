package JDBC;

public class emp {
	private int id;
	private String fname;
	private String lname;
	private int d_id;
	private String dname;
	
	public int getid()
	{
		return this.id;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public int getdid()
	{
		return this.d_id;
	}
	public void setidid(int id)
	{
		this.d_id=id;
	}
	public String getfname()
	{
		return this.fname;
	}
	public void setfname(String name)
	{
		this.fname=name;
	}
	public String getlname()
	{
		return this.lname;
	}
	public void setlname(String name)
	{
		this.lname=name;
	}
	public String getdname()
	{
		return this.dname;
	}
	public void setdname(String name)
	{
		this.dname=name;
	}
}
