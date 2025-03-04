// Student.java
class Student{
	private String name;
	private long prn;
	public void setName(String name, long prn){
		this.name = name;
		this.prn = prn;
	}
	
	public String getName(){
		return(name);
	}
	
	public void setPRN(long prn){
		this.prn = prn;
	}
	
	public long getPRN(){
		return(prn);
	}
	
	public void display(){
		System.out.println("Name: "+name+"/nPRN: "+prn);
	}
}
