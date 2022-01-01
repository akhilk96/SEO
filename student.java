Import java.util.*;
public class Student {
    hashmap<Integer,String> student=new hashmap<Integer,String>();
    public int student_usn;
    public String student_name;
    public student(){
    }
    public void addStudentusn(int susn){
        student.add(susn);
    }
    
    public void addstudentname(int sname){
        student.add(sname);
    }
    
    public void addstudentmobileno(int sid){
        student.add(sid);
    }
    
    public void addstudentemail(int semail){
        student.add(semail);
    }
    
    public void addstudentpassword(int spwd){
        student.add(spwd);
    }
    
    public void addstudent(int sid, String sname){
        student.add(sid,sname);
    }
    
    public void editstudent(int sid,String sname){
        student.replace(sid);
    }
    
    public void deletestudent(int sid,String sname){
        college.remove(sid);
    }
    public void updatestudent(){
    }
    
    public void saveStudent(){
    System.out.println("Student saved successfully");
    }
    
    public void searchstudent(int sid){
        if (student_ids.contains(sid))
        system.out.println("student found");
        else
        system.out.println("student not found");
    }
}
