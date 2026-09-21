public class ConDemo{
    int rollno;
    String name;
    float fee;
    // constructer
    public ConDemo(int i,String n, float f){
        this.rollno=i;
        this.name=n;
        this.fee=f;
    }
    // Main method
    public void sample() {
        System.out.println("Test method");
        System.out.println("Roll no is:"+this.rollno);
        System.out.println("Name is:"+ this.name);
        System.out.println("Fee is:"+ this.fee);
    }
    //Main method
    public static void main (String[]args) {
        System.out.println("Hello cSM D");
        ConDemo cd=new ConDemo(1234,"srivalli",234.56f);
        cd.sample();
    }
    }
    