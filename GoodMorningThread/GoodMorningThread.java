//Create Thread using Thread Class
class GoodMorningThread extends Thread // step-1
{
public void run() // step-2
{
try {
while (true) {
System.out.println("Good Morning");
Thread.sleep(1000); // 1 second
}
} catch (InterruptedException e) {
System.out.println(e);
}
}
}
class HelloThread extends Thread {
public void run() {
try {
while (true) {
System.out.println("Hello");
Thread.sleep(2000); // 2 seconds
}
} catch (InterruptedException e) {
System.out.println(e);
}
}
}
class WelcomeThread extends Thread {
public void run() {
try {
while (true) {
System.out.println("Welcome");
Thread.sleep(3000); // 3 seconds
}
} catch (InterruptedException e) {
System.out.println(e);
}
}
}
public class MainThread {
public static void main(String[] args) {
GoodMorningThread t1 = new GoodMorningThread();// step-3
HelloThread t2 = new HelloThread();
WelcomeThread t3 = new WelcomeThread();
t1.start();// step-4
t2.start();
t3.start();
}
}