class shape
{
void draw()
{
    System.out.println("i am from shape");
}
void erase()
{
    System.out.println("i am earasing shape");
}
}
class circle extends shape
{
    void draw()
    {
        System.out.println("i am from circle");
    }
    void erase()
    {
        System.out.println("i am earasing circle");
    }

}
class triangle extends shape
{
    void draw()
    {
        System.out.println("i am from triangle");
    }
    void erase()
    {
        System.out.println("i am earasing triangle");
    }
}
class square extends shape
{
    void draw()
    {
        System.out.println("i am from square");
    }
    void erase()
    {
        System.out.println("i am earasing square");
    }
}
class Q3 {
    public static void main(String[] args) {
        shape s = new circle();;
        shape t = new triangle();
        shape s1 = new square();
        s.draw();
        s.erase();
        t.draw();
        t.erase();
        s1.draw();
        s1.erase();
    }
}
