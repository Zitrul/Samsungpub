public class Student extends User implements Printable{
    String group;
    public void sayHello(){

        System.out.printf("Привет! Я студен, мое имя", super.name);
    }
    public Student(String name, int phone,String Secondrname,String patronymic,String group){

        super(name, phone,Secondrname,patronymic);
        this.group = group;
    }
    public Student(String name,String Secondrname,String patronymic,String group){
        super(name,Secondrname,patronymic);
        this.group = group;
    }
    public Student(Student student){
        super(student);
    }
    public void printInfoToConsole(){
        System.out.println("================================\n" +
                "Привет, Я ученик!\n"+"Меня зовут "+super.Secondrname +" "+super.name+" "+super.patronymic+"\nЯ учусь в группе"+" "+this.group);
    }


}
