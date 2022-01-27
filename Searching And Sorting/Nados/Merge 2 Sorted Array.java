 public static int[] mergeTwoSortedArrays(int[] nums1, int[] nums2){
    int m = nums1.length;
      int n = nums2.length;
     int i = 0 , j = 0 , k=0;
        int []arr = new int [m+n];
        while (i<m && j<n){
            if ( nums1[i]<=nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            }else{
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        while (i<m){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        
        while ( j<n){
            arr[k]=nums2[j];
            j++;
            k++;
        }
     return arr;
  }
