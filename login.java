package p1;
public class login
{
	private String uname;
	private String execute()
	{
          if(uname.equals("himanshu"))
             return("success");
          else
             return ("Invalid");
	}
        public String getUname()
	{
          return uname;
	}
	public void setUname(String uname)
	{
          this.uname=uname;
	}

}