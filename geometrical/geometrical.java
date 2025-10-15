abstract class shape{
abstract void numberofSide();
}
class trapizium extends shape{
void numberofSides(){
System.out.println("A trapizium has 4 sides.");
}
}
class triangle extends shape{
void numberofSides(){
System.out.println("A triangle has 3 sides.");
}
}
class hexagon extends shape{
void numberofSides(){
System.out.println("A hexagon has 6 sides.");
}
}
class geometrical{
public static void main(String[]args){
shape s1=new trapizium();
shape s2=new triangle();
shape s3=new hexagon();
s1.numberofSides();
s2.numberofSides();
s3.numberofSides();
}
}