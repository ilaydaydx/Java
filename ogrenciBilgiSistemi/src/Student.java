public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;

    double avaragec1;
    double avaragec2;
    double avaragec3;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }

    void addBulkExamNote(int note1,int note2,int note3){
        if (note1>=0&&note1<=100){
            this.c1.note=((int) (note1*0.8));
        }
        if (note2>=0&&note2<=100){
            this.c2.note=((int) (note2*0.8));
        }
        if (note3>=0&&note3<=100){
            this.c3.note=((int) (note3*0.8));
        }
    }

    void addBulkAddVerbalGrade(int not1,int not2,int not3){
        if (not1>=0&&not1<=100){
            this.c1.verbal=((int) (not1*0.2));
        }
        if (not2>=0&&not2<=100){
            this.c2.verbal=((int) (not1*0.2));
        }
        if (not3>=0&&not3<=100){
            this.c3.verbal=((int) (not1*0.2));
        }
    }

    void isPass(){
        System.out.println("\n--------------------");
        this.avaragec1=(this.c1.note+this.c1.verbal);
        this.avaragec2=(this.c2.note+this.c2.verbal);
        this.avaragec3=(this.c3.note+this.c3.verbal);
        this.avarage=(this.avaragec1+this.avaragec2+this.avaragec3)/3;
        if (this.avarage>55){
            System.out.println("\nCongratulations! You have successfully passed the class.\n");
            this.isPass=true;
        }else {
            System.out.println("\nYou did not pass the class!\n");
            this.isPass=false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name+" Note: "+this.c1.note);
        System.out.println(this.c1.name+" Verbal Note: "+this.c1.verbal);
        System.out.println(this.c1.name+" Avarage: "+this.avaragec1);
        System.out.println("\n");
        System.out.println(this.c2.name+" Note: "+this.c2.note);
        System.out.println(this.c2.name+" Verbal Note: "+this.c2.verbal);
        System.out.println(this.c2.name+" Avarage: "+this.avaragec2);
        System.out.println("\n");
        System.out.println(this.c3.name+" Note: "+this.c3.note);
        System.out.println(this.c3.name+" Verbal Note: "+this.c3.verbal);
        System.out.println(this.c3.name+" Avarage: "+this.avaragec3);
        System.out.println("\n");
        System.out.println("\nYour avarage is: "+this.avarage);
    }
}
