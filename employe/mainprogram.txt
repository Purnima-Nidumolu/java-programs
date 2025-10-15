class employe{
String name;
double salary;
void details()
{
System.out.println("Name:"+name);
System.out.println("Salary:"+salary);
}
}
public class mainprogram{
public static void main(String[]args){
employe ram=new employe();
employe ramu=new employe();
ram.name="Ram";
ram.salary=32000;
ramu=ram;
ram.details();
ramu.details();
}
}