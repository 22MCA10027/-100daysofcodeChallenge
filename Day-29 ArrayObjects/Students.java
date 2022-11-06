// Java program to illustrate creating an Array of Objects

class Student {
	 int regno;
	String name;
	Student(int regno, String name)
	{
		this.regno = regno;
		this.name = name;
	}
}


public class Students {
	public static void main(String[] args)
	{
		
		Student[] arr;

		
		arr = new Student[5];

		
		arr[0] = new Student(27, "Balaji");

	
		arr[1] = new Student(31, "Adarsh");

		
		arr[2] = new Student(76, "Pawan");
		arr[3] = new Student(86, "Kishore");
		arr[4] = new Student(102, "Vignesh");

		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : "+ arr[i].regno + " "	+ arr[i].name);
	}
}
