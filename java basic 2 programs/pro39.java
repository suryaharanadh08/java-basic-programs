import java.util.Arrays;

class Pro39 {
    public static void main(String[] args) {
    int num[] = {45, 20, 23, 74, 43, 454};
        
    int n = num.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                
                if (num[j] < num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    swapped = true;
                }
            }
            
            if (!swapped) break;
                
        System.out.println(Arrays.toString(num));
    }

       
        
        
    }
}
