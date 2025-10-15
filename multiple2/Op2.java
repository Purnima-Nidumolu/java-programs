interface A{
static int a=10;
}
public class Op1 implements A{
public static void main(String args[]){
System.out.println(a);
}
}
interface B{
final int x=20;
abstract class daa{
abstract void result();
}
}
abstract class daa extends Op1 implements B{
public void result(){
System.out.println(x);
}
void print(){
System.out.println("The result of"+(a+x));
}
}
public class Op2 extends daa{
public static void main(String args[]){
Op2 obj=new Op2();
obj.result();
obj.print();
}
}
