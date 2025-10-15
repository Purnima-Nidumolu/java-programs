class person{
void introduce(){
System.out.println("I am a person.");
}
}
class student extends person{
void study(){
System.out.println("I am Studying.");
}
}
class collegeStudent extends student{
void attendLecture(){
System.out.println("I am attending a college lectures.in SRGEC");
}
}
public class MultilevelInheritanceperson{
public static void main(String[]args){
collegeStudent cs=new collegeStudent();
cs.introduce();
cs.study();
cs.attendLecture();
}
}
