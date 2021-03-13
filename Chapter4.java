
class A1{
    int i;
    public boolean equals(A1 a)
    {
        if(this.i == a.i)
            return true;
        else
            return false;
    }
}

public class Chapter4 {
    // int i;
    // void methodA(int i)
    // {
    //    this.i = i; 
    // }
    // void methodB(int i)
    // {
    //    this.i = i; 
    // }
    public static void main(String[] args) {
        // Chapter4 c1 = new Chapter4();
        // c1.i = 10;
        // c1.methodA(10);      
        // for(int j=1 ; j<=10 ; j++)
        // {
        //     System.out.println(j);
        // }

        A1 a1 = new A1();
        A1 a2 = new A1();
        a1.i = 10;
        a2.i = 10;
        System.out.println(a1);
        System.out.println(a2);
        if(a1 == a2)
            System.out.println("Both are same");
        else
            System.out.println("Both are NOT same");           
        
        if(a1.equals(a2))
            System.out.println("Both are same");
        else
            System.out.println("Both are NOT same"); 
    }    
}
