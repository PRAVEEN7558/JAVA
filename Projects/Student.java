class Student
{
    int RollNumber;
    double cgpa;
    int totelMarks;
    char cls_Section;
    final static int passMark=35;
    final static int No_Subject=5;
public int marks(int a,int b,int c,int d,int e)
    {
        int tmark=a+b+c+d+e;
        return tmark;
    }
public void PassMark(int a,int b,int c,int d,int e)
    {
     if(a>=35 && b>=35 && c>=35 && d>=35&& e>=35)
        {
             System.out.println("Pass");
             //return pass;
        }
    else{
            System.out.println("Fail");
	        //return fail;
        }
}
void display()
{
        
         System.out.println("RollNumber: "+RollNumber);
         System.out.println("cls_Section "+cls_Section);
		 System.out.println("cgpa: "+cgpa);
		 System.out.println("totelMarks: "+totelMarks);
         System.out.println("passMark : " +passMark);
         System.out.println("No_Subject: "+No_Subject);
}
public static void main(String arg[])
	{
    Student std1=new Student();
    Student std2=new Student();
    Student std3=new Student();
    Student std4=new Student();
    Student std5=new Student();
 System.out.println("student 1\n");
    std1.RollNumber=58;
    std1.cgpa=7.5;
    std1.cls_Section='a';
    std1.totelMarks=std1.marks(25,99,57,86,45);
    std1.PassMark(25,99,57,86,45);
    std1.display();
 System.out.println("\nstudent 2\n");  
    std2.RollNumber=59;
    std2.cgpa=7.0;
    std2.cls_Section='a';
    std2.totelMarks=std1.marks(68,96,57,45,76);
    std2.PassMark(68,96,57,45,76);
    std2.display();
System.out.println("\nstudent 3\n");  
    std3.RollNumber=75;
    std3.cgpa=6.0;
    std3.cls_Section='b';
    std3.totelMarks=std1.marks(63,56,55,65,86);
    std3.PassMark(63,56,55,65,86);
    std3.display();
    

}
}    
  
