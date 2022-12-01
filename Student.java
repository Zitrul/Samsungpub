public class Student extends User implements Printable{
    private String group;
    public void sayHello(){

        System.out.printf("Привет! Я студен, мое имя", super.name);
    }
    public Student(String name, int phone,String secondrname,String patronymic,String group){
        super.phone = phone;
        super.name = name;
        super.secondrname = secondrname;
        super.patronymic = patronymic;
        this.group = group;
    }
    public Student(String name,String secondrname,String patronymic,String group){
        super.name = name;
        super.secondrname = secondrname;
        super.patronymic = patronymic;


        this.group = group;
    }
    public Student(Student student){
        super.name = student.name;
        super.secondrname = student.secondrname;
        super.patronymic = student.patronymic;


        this.group = student.group;
    }
    public void printInfoToConsole(){
        System.out.println("================================\n" +
                "Привет, Я ученик!\n"+"Меня зовут "+super.secondrname +" "+super.name+" "+super.patronymic+"\nЯ учусь в группе"+" "+this.group);
    }


}
