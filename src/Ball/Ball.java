package Ball;
import java.lang.*;
public class Ball {
    private String name;
    private int age;
    public Ball(String n, int a){
        name = n;
        age = a;
    }
    public Ball(String n){
        name = n;
        age = 0;

    }
    public Ball(){
        name = "Blue";
        age = 2;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }
    public void Rez(){
        System.out.println(name+"-Цвет шара; "+age+"-Радиус");
    }
}

