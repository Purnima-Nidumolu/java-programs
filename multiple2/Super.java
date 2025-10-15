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
Dog d=new Dog();
d.eat();
d.eat();
}
}