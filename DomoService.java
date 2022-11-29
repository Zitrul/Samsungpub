import java.util.ArrayList;
public class DomoService {
    University unever;
    String adress = "House";
    public void demo(){
        Student s = new Student("Alex",80800,"NN","Lexa","IT");
        Student s1 = new Student("ADAKSD",808340,"DSFPDSFKLSDJF","DSFSDF","Algebra");
        Teacher t = new Teacher("N",80790,"S","P","IT");
        Teacher t1 = new Teacher("G",874554,"KJKFD","OFDGKDFG","Algebra");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s);
        students.add(s1);
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();

        teachers.add(t);
        teachers.add(t1);
        unever = new University( students,teachers,this.adress);

        unever.printInfoToConsole();

    }
}
