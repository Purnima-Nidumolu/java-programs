Final class A {
int a; 
A(int x){
a = x;
}
void display(){
System.out.println("a ="+ a);
}
}
class B extends A{
int b;
B(int x, int y){
super(x);
this.b=y;
}
void display(){
System.out.println("b = " + b);
}
}
class Finalclass {
public static void main(String args[]) {
A objA= new A(10);
B objB= new B(100,200);
objA.display();
objB.display();
}
}








