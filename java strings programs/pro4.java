
/*program to count the total number of Words,Numbers,Spl characters,vowels
and consonants in a string*/

class pro4
{
    public static void main(String args[])
    {
        String word = "Hello java 1523@%";
        String word2 =word.toUpperCase();
        char[] temp=word2.toCharArray();
        String arr1[]=word.split(" "); //splits and stores in an array based on spaces
        
        String arr2[]=word2.split("");  //splits and stores in an String array each character
        System.out.println("No of words in the given string is : "+arr1.length);
        int ccons=0,cvowels=0,cnums=0,cspecial=0;
        for(int i=0;i<temp.length;i++)
        {
           if(temp[i]>='A' && temp[i]<='Z')
            {
                if(temp[i]=='A' || temp[i]=='E'|| temp[i]=='I'|| temp[i]=='O'|| temp[i]=='U')
                {
                      cvowels++;
                }
                else
                      ccons++;
            }
            else if(temp[i]>='0' && temp[i]<='9')
            {
                cnums++;
            }
            else
            {
                if(temp[i]!=' ')
                {
                     cspecial++;
                }
            }
               
           
        }
        System.out.println(" The total no of consonants are :  "+ccons);
        System.out.println(" The total no of vowels are :  "+cvowels);
        System.out.println(" The total no of numbers are :  "+cnums);
        System.out.println(" The total no of special characters are :  "+cspecial);

    }
}