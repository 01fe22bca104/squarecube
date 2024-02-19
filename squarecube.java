public class squarecube extends calculator 
{
    int a,b,c;
    void square(int c)
    {
        int sq=c*c;
        System.out.println("Square of the number is:"+sq);

    }
    void cube(int c)
    {
        int cb=c*c*c;
        System.out.println("Cube of the number is:"+cb);
    }
    public static void main(String[] args){
        squarecube s = new squarecube();
        
        s.addition(2,3);
        s.substraction(3,4);
        s.multiplication(3,4);
        s.divison(10,5);
        s.square(3);
        s.cube(3);



    }
}
