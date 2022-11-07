// Java program to illustrate creating objects of an array

class Student
{
	
	public String name;
	Student(String name)
	{
		this.name = name;
	}

	public String toString()
    {
		return name;
	}
}

// Elements of the array are objects of a class Student
public class ArrayNames
{
	public static void main (String[] args)
	{
		// declares an Array and initializing the elements of the array
		Student[] Students = new Student[]
        { new Student("Balaji"),new Student("Hari"),new Student("Adarsh"),new Student("Vignesh")};
       // accessing the elements of the specified array
		for(Student m:Students){
			System.out.println(m);
		}
	}
}
