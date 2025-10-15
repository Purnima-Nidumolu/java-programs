interface A{
void Show();
}
interface B{
void display();
}
class C implements A,B{
public void Show(){
System.out.println("Showable");
}
public void display(){
System.out.println("Printable");
}
}
class Multiple1{
public static void main(String args[]){
C obj=new C();
obj.Show();
obj.display();
}
}






