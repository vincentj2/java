class FirstJavaProgram
{
    public static void main(String[] args)
    {
    toBinary(46);	 
    }
    public static int toBinary(int decimal) {
        if(decimal > 0) {
            int bin = decimal % 2;
            decimal /= 2;
            
            toBinary(decimal);
            System.out.print(bin);
        }
        
        return 0;
    }
}

