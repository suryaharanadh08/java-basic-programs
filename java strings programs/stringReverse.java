/*Reverse a String */
class stringReverse
{
    public static void main(String[] args) {
        String name="Haranadh";
        System.out.println("Revere of "+name+" is ");
        for(int i=name.length()-1;i>=0;i--)
        {
            System.out.print(name.charAt(i));
        }
        System.out.println("");
    }
}