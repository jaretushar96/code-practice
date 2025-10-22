public class Company {
    
    String comp;
    String branch;
    Employee empl;
    Company(String comp, String branch,Employee empl ) 
    {
       this.comp=comp;
       this.branch=branch;
       this.empl=empl;

    }

    public void show()
    {
        System.out.println("\n ID :"+empl.id+" \n Name"+empl.name+" \nCompany :"+comp+"\n Branch"+branch);
    }

    



    }

    



