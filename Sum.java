class Sum{
    public static void main(String[] args) {
        // System.out.println(args[0]);//10 
        // System.out.println(args.length);
        // System.out.println(args[0] + args[1]);

        //10 20 30 40
        // ram shyam 
        int sum =0 ; 
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
            sum = sum + Integer.parseInt(args[i]);
        } 
        System.out.println("sum => "+sum);
    }
}
//wrapper class=> 
    //byte > Byte 
    //int > Integer 
    //char > Character 
