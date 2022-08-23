package polymorphism;

public class sample1                            //method OverLoading   --> declaring multiple method with same classname but with diffrent parameters/arguments in same class
{
public void Studentinfo(String studentname, int studentrollno, float studentpercentage)  //3 parameter
{
	System.out.println(studentname);
	System.out.println(studentrollno);
	System.out.println(studentpercentage);
}

public void Studentinfo(String studentname, int studentrollno, float studentpercentage, char studentgrade)   //4 parameter
{
	System.out.println(studentname);
	System.out.println(studentrollno);
	System.out.println(studentpercentage);
	System.out.println(studentgrade);
}



}
