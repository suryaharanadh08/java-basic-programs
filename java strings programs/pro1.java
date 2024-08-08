/*program to print individual characters of a string*/

class pro1
{
    public static void main(String[] args) {
        String word = "PROGRAMMING";
        String[] arr = word.split("");
        for(String s : arr)
        {
            System.out.println(s);
        }
    }
}