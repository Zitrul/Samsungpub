import java.util.ArrayList;
public class DomoService {
    University unever;
    String adress;
    public DomoService(String adress){
        this.adress = adress;


    }
    public void demo(){
        Student s = new Student("Alex",80800,"NN","Lexa","IT");
        Teacher t = new Teacher("N",80790,"S","P","IT");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s);
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(t);
        unever = new University( students,teachers,this.adress);

        unever.printInfoToConsole();

    }
}
