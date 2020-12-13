package test1207;

public class Main {
    public static void main(String[] args) {
        Child child = new Child(1,2,3);
    }
}
class Parent{
    private int a,b;
    Parent(){

    }
    Parent(int aa, int bb){
        this.a=aa;
        this.b=bb;
    }
    int ad(){
        return a+b;
    }
}
class Child extends Parent{
    int c;
    Child(int a,int b,int c){
        super(a,b);
        this.c=c;
    }
    Child(int c)
    {
//        this(100, 100, c);
        super(100,100);
    }

}