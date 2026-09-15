public class conDemo {
    int rollNo;
    String name;
    //constructer
    public conDemo(){
        this.rollNo=1234;
        System.out.println("variables are ready");
    }
    void showDetails(){
        System.out.println("My roll number is:"+rollNo);
        System.out.println("My Name is:"+name);
    }
    public static void main (String args[]){
        conDemo cd=new conDemo();//
        cd.name="g";
        cd.showDetails();
    }
    }
    

