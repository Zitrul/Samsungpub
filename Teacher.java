public class Teacher extends User implements Printable{
    String subject;

    public void sayHello(){

        System.out.printf("Здравствуйте! Я преподаватель, мое имя", super.name);
    }
    public Teacher(String name, int phone,String Secondrname,String patronymic,String subject){
        super(name, phone,Secondrname,patronymic);
        this.subject = subject;
    }
    public Teacher(String name,String Secondrname,String patronymic,String subject){
        super(name,Secondrname,patronymic);
        this.subject = subject;
    }
    public Teacher(Teacher student){
        super(student);

    }
    public void printInfoToConsole(){
        System.out.println("--------------------------------\n" +
                "Здравствуйте, Я учитель!\n"+"Меня зовут "+super.Secondrname +" "+super.name+" "+super.patronymic+"\nЯ преподаю "+this.subject);
    }

}
