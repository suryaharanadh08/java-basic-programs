class pro32
{
    public static void main(String[] args) {
        int a=100,b=20,c=40;
        int small=(a<b && a<c)?(a):((b<a && b<c)?(b):c);
        System.out.println("the smallest num is : "+small);
    }
}