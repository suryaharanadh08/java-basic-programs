class pro5{
    public static void main(String[] args) {
        char ch = '$';
        if(ch>='A' && ch<='Z')
        {
            System.out.println("It is an UpperCase letter");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("It is a LowerCase letter");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("It is a numeric");
        }
        else{
            System.out.println("It is a special case character");
        }
    }
}