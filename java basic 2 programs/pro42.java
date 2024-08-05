class Pro42 {
    static int happy(int temp) {
        int s = 0;
        while (temp > 0) {
            int rem = temp % 10;
            s = s + (rem * rem);
            temp = temp / 10;
        }
        return s;
    }

    public static void main(String[] args) {
        int num = 5;
        while (true) {
            num = happy(num);
            if (num == 1) {
                System.out.println("It is a happy number");
                break;
            } else if (num == 4) {
                System.out.println("It is not a happy number");
                break;
            }
        }
    }
}