public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbal;""

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            //printTeacher();
        }else {
            System.out.println("Teacher and course department does not match!");
        }
    }

    void printTeacher(){

        this.teacher.print();
    }

}
