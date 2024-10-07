class Demo{
    public static void main(String args[]){
        String str = new String("surya");
        StringBuffer buffer = new StringBuffer("hari");
        str.concat("hi");
        buffer.append("hi:");
        System.out.println(str+"  "+buffer);
    }
}