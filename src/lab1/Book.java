package lab1;
import java.lang.*;
public class Book {
    private String name;
    private int age;
    public Book(String n, int a){
        name = n;
        age = a;
    }
    public Book(String n){
        name = n;
        age = 0;

    }
    public Book(){
        name = "Война и мир";
        age = 666;
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
    public void RBook(){
        System.out.println(name+"-Название книги; "+age+" цисло страниц");
    }
}