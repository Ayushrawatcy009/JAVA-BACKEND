class student
{
   int roll;
   String name;
   int marks; 
}

public class arrayprog3 
{
    public static void main(String[] args) 
    {
        student s1 =new student();
        s1.roll=1;
        s1.name="levi";
        s1.marks=90;
        student s2 =new student();
        s2.roll=2;
        s2.name="lavi";
        s2.marks=80;
        student s3 =new student();
        s3.roll=3;
        s3.name="lovi";
        s3.marks=99;
        
        student stu[] =new student[3]; //array of students
        //s1,s2,s3became part of stu
        stu[0]=s1;
        stu[1]=s2;
        stu[2]=s3;
        //stu is an array to hold 3 student objects
        for (int i = 0; i < stu.length; i++) 
        {
            System.out.println( stu[i].name +":"+stu[i].marks);
        }

        //enhanced for loop
        for(student stud:stu)
        {
            System.out.println(stud.name+","+stud.marks);
        }
    }
}
