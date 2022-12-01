public class Teacher extends User implements Printable{
    private String subject;

    public void sayHello(){

        System.out.printf("Здравствуйте! Я преподаватель, мое имя", super.name);
    }
    public Teacher(String name, int phone,String secondrname,String patronymic,String subject){
        super.phone = phone;
        super.name = name;
        super.secondrname = secondrname;
        super.patronymic = patronymic;
        this.subject = subject;
    }
    public Teacher(String name,String secondrname,String patronymic,String subject){
        super.name = name;
        super.secondrname = secondrname;
        super.patronymic = patronymic;
        this.subject = subject;
    }
    public Teacher(Teacher teacher){
        super.name = teacher.name;
        super.secondrname = teacher.secondrname;
        super.patronymic = teacher.patronymic;
        this.subject = teacher.subject;

    }
    public void printInfoToConsole(){
        System.out.println("================================\n" +
                "Здравствуйте, Я учитель!\n"+"Меня зовут "+super.secondrname +" "+super.name+" "+super.patronymic+"\nЯ преподаю "+this.subject);
    }

}
