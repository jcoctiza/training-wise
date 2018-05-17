package main.javaInterface;


class JavaInterfaceDemo implements Dragon{
    public static void main(String args[]){
        Dragon d = new JavaInterfaceDemo();
        d.sample();
    }
    public void sample(){
        System.out.println("Success! JavaInterfaceDemo successfully implements Dragon");
    }
}

interface Dragon {
    public void sample();
}