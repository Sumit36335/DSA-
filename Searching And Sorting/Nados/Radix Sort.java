public class Main {

  

  public static void radixSort(int[] arr) {
    // write code here  
    int max = 0 ; 
    for ( int val : arr )max = Math.max(max , val);
    int digits = (int)Math.log10(max)+1 ; 
        int maxPlaceValue = (int)Math.pow(10 , digits-1 );
    for (int i  = 1 ; i<= maxPlaceValue ; i*= 10  ){
      countSort(arr , i);
    }  
     

  }

  public static void countSort(int[] arr, int exp) {
    // write code here
    System.out.print("After sorting on " + exp + " place -> ");


      int [] freq = new int [10];
    
    for ( int i = 0 ; i < arr.length ; i++){
        int idx  = (arr[i] /exp )%10 ; 
        freq[idx]++;
    }

     int [] prefSum = new int [10];
     prefSum[0]= freq[0];

     for ( int i = 1 ; i< freq.length ; i++){
       prefSum[i] = prefSum[i-1] + freq[i];
     }

     int [] res   = new int [arr.length];

     for ( int  i = arr.length-1 ; i>=0 ;i--){
       prefSum[(arr[i] /exp )%10]--;
       int idx = prefSum[(arr[i] /exp )%10];
       res[idx] = arr[i];
     }

     for ( int i = 0 ; i< arr.length ; i++){
       arr[i] = res[i];
     }


    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}
