class Animal{
void eat(){
System.out.println("Animal eats");
}
}
class Dog extends Animal{
void eat(){
System.out.println("Dog barks");
}
}
public class MethodOverRiding{
public static void main(String args[]){
Animal a=new Dog();
a.eat();
a.eat();
}
}