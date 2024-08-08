/*Program to search a word inside a string*/

class pro17
{
    public static void main(String[] args) {
        String s = "welcome to java world";
        String x = "java";
        int  sol =s.indexOf(x);
        if(sol!=-1)
        {
            System.out.println(" The given word exists at position : "+sol);
        }
        else{
            System.out.println(" The given word doesnt exist");
        }
        
    }
}