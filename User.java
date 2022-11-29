public abstract class User {
    int phone;
    String name;
    String Secondrname;
    String patronymic;
    public abstract void sayHello();
    public  User(String name, int phone,String Secondrname,String patronymic){
        this.name = name;
        this.phone = phone;
        this.Secondrname = Secondrname;
        this.patronymic = patronymic;
    }
    public  User(String name,String Secondrname,String patronymic){
        this.name = name;
        this.Secondrname = Secondrname;
        this.patronymic = patronymic;
    }
    public  User(Student student){
        this.name = student.name;
        this.Secondrname = student.Secondrname;
        this.patronymic = student.patronymic;
        this.phone = student.phone;
    }
    public  User(Teacher teacher){
        this.name = teacher.name;
        this.Secondrname = teacher.Secondrname;
        this.patronymic = teacher.patronymic;
        this.phone = teacher.phone;
    }
}
