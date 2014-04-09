
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Person
{
    private int stud_no;
    public Student(){ 
        super();
        stud_no = 0;
    }
    public Student(String newName, int new_no){
        super(newName);
        stud_no = new_no;
    }
    public void setStudNo(int new_no){
        stud_no = new_no;
    }
    public int getStudNo(){ 
        return stud_no;
    }
    public void writeOutput(){
        super.writeOutput();
        System.out.println("Name:" + this.getName());
        System.out.println("Student Number:" + stud_no); 
    }
    public boolean equals (Student s){ 
        return(super.sameName(s) && (this.stud_no == s.stud_no));
    }
  
}
