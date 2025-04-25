public class Array2 {
    
    public static void main(String[] args) {

        int arr[]  = new int[56];
        arr[0] = 98;
        arr[1] = 99;
        arr[2] = 95;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[2] = 97;
        System.out.println(arr[2]);
        int avg = (arr[0]+arr[1]+arr[2])/3;
        System.out.println("percentage : "+avg+"%");
    }


}
