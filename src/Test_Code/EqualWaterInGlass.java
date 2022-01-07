package Test_Code;

public class EqualWaterInGlass {
    public static void main(String[] args) {

    }

    static int valueOf_K(int arr[] , int n){
        int k = 0 ;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        k = sum / n;
        if(sum % n == 0)
            return k ;
        else
            return  -1;
    }
    static int EqualWater(int arr[], int n , int k){
        for (int i = 0; i < n; i++) {

        }
        return 0;
    }
}
