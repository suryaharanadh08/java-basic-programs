class Demo{
    
        static int Mymethod(int x){
        if(x>0){
            return x+(Mymethod(x-1));
        }
        else{
            return 0;

        }
        
        }

    public static void main(String args[]){
        System.out.println(Mymethod(5));
        
  }
}