class Grandparent
{
    String GrandFatherName;
    String GrandMotherName;
    Grandparent()
    {

    }
    Grandparent(String a, String b)
    {
        this.GrandFatherName=a;
        this.GrandMotherName=b;
        System.out.println("Name of grandfather is "+GrandFatherName+" and name of grandmother is "+GrandMotherName);
    }
}
class Parent extends Grandparent
{
    String FatherName;
    String MotherName;
    Parent(){

    }
    Parent(String s1,String s2, String s3, String s4)
    {
        this(s3,s4);
        this.FatherName=s1;
        this.MotherName=s2;
        System.out.println("Father name is "+FatherName+" mother name is "+MotherName);
    }
    Parent(String s5,String s6 )
    {
        super(s5,s6);
    }

}

class child extends Parent{
    child(String a,String b, String c ,String d)
    {
        super(a,b,c,d);
    }
    public static void main(String[] args) {
        child c =  new child("SHAM","RASILA","Ganu","Lila");

        System.out.println("Heance constuctor chaining is achived ");

    }
}
