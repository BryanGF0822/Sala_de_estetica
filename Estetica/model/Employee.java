package model;

public class Employee{

	private String name;

	private int id;

	private String post;

	private int admissionDate;

	//Relations

	private Service s1;

	private Service s2;

	private Service s3;

	//Metodos


	public Employee(String name, int id, String post, int admissionDate, Service s1, Service s2, Service s3){

		this.name = name;

		this.id = id;

		this.post = post;

		this.admissionDate = admissionDate;
	}

	public String getName(){

		return name;
	}

	public void setName(String name){

		this.name = name;
	}

	public int getId(){

		return id;
	}

	public void setId(int id){

		this.id = id;
	}

	public String getPost(){

		return post;
	}

	public void setPost(String post){

		this.post = post;
	}

	public int getAdmissionDate(){

		return admissionDate;
	}

	public void setAdmissionDate(int admissionDate){

		this.admissionDate = admissionDate;
	}




}