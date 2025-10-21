


public class Book {
    
    Library l1= new Library("XYZ","Pune",101);

    String b1;
    String b2;
    Book(String b1, String b2)
    {
        this.b1=b1;
        this.b2=b2;
    }

    void show()
    {
        l1.show();
        System.out.println(" Books :"+b1+"  "+b2);
    }

}
