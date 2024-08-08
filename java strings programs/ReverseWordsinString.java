class ReverseWordsinString
{
    public static void main(String[] args) {
        String word ="My name is Surya";
        String temp[]=word.split(" ");     //Splits and stores in temp array
        for(int i=temp.length-1;i>=0;i--)  //Accessing from the last index
        {
            System.out.print(temp[i]+" ");
        }

    }
}