public class Main {

  public static void countSort(int[] arr, int min, int max) {
   //write your code here
    
    int [] freq = new int [max - min + 1 ];
    
    for ( int i = 0 ; i < arr.length ; i++){
        int idx  = arr[i] - min; 
        freq[idx]++;
    }
     int [] prefSum = new int [max - min + 1];
     prefSum[0]= freq[0];

     for ( int i = 1 ; i< freq.length ; i++){
       prefSum[i] = prefSum[i-1] + freq[i];
     }

     int [] res   = new int [arr.length];

     for ( int  i = arr.length-1 ; i>=0 ;i--){
       prefSum[arr[i] - min ]--;
       int idx = prefSum[arr[i] - min ];
       res[idx] = arr[i];
     }

     for ( int i = 0 ; i< arr.length ; i++){
       arr[i] = res[i];
     }
    
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}
