public class Library {
    
String libName;
String city;
int id;

Library(String lib1, String ci1 ,int id1)
{
this.libName=lib1;
this.city=ci1;
this.id=id1;
}



void show()
{
    System.out.println(" Library name "+libName+"\n City "+city+"\n ID "+id);
}

}
