class Example {
    int x=5, y=6;
    void addition(){
        System.out.println("Addition is:"+(x+y));
    }
    void subtraction() {
        System.out.println("subtraction is:"+(x-y));
    }
}
class Demo {
    public static void main(String[] args) {
        int x=10, y=20;
        int z=x+y;
        System.out.println("result is:"+z);
        Demo d=new Demo();
        Example e=new Example();
        e.addition();
        e.subtraction();

    }
}
    

