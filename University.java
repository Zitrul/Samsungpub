import java.util.ArrayList;
public class University implements Printable{
    private String adress;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    public University(ArrayList<Student> s,ArrayList<Teacher> t, String adress){
        for(Student student : s){
            this.students.add(student);
        }
        for(Teacher teacher : teachers){
            this.teachers.add(teachers);
        }

        this.adress = adress;
    }
    public void printInfoToConsole(){
        System.out.println("+++++++++++++++++++++++++++++++\n" +
                "Приветсвуем вас в университете "+this.adress+"\n"+
                "Вот информация о наших лудших ученикаках\n"

        );
        for(Student student : students){
            student.printInfoToConsole();
        }
        System.out.println("+++++++++++++++++++++++++++++++\n" +
                "Вот информация о наших лудших учитилях\n"

        );
        for(Teacher teacher : teachers){
            teacher.printInfoToConsole();
        }


    }
}
