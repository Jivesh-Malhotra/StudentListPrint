package week2pro;

public class Week2pro 
{

    
    public static void main(String[] args) 
    {
        // store and print the student list
        
        Student[] list = new Student[3]; // declaration Array of objects
        Student s1 = new Student();
        s1.setName("Peter");
        s1.setAge(21);
        Student s2 = new Student();
        s2.setName("Jivesh");
        s2.setAge(21);
        Student s3 = new Student();
        s3.setName("Rob");
        s3.setAge(20);
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName() +" "+list[i].getAge());
        }
    }
    
}
