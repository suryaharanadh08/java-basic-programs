class MyOwnExceptionA extends Exception{
    MyOwnExceptionA(String s){
        super(s);
    }
}
class MyOwnExceptionB extends Exception{
    MyOwnExceptionB(String s){
        super(s);
    }
}
class Pro2{
    public static void main(String args[]){
        String username = "Tony";
        String password = "123Tony@";
        String Department = "HR";
        try{
            if((username == "Tdony")&& (password == "123Tony@")){
                System.out.println("Login Successful");
            }
            else{
                throw new MyOwnExceptionA("Invalid Credentials");
            }
            if(Department == "HR"){
                System.out.println("welcome to HR department");
            }
            else{
                throw new MyOwnExceptionB("Not permitted to this Department");
            }
        }
        catch(MyOwnExceptionA | MyOwnExceptionB e){
            System.out.println(e);
        }
    }
}