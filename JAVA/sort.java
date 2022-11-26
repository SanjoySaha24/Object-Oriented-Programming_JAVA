 class sort {    
    public static void main(String[] args) {        
            
        //Initialize array     
        
        
int n= args.length;  
            
      int[] arr= new int[n];
            
        //Sort the array in ascending order    
        for (int i = 0; i < n; i++) {  
arr[i]= Integer.parseInt(args[i]); }


 for (int i = 0; i < n; i++) {    
            for (int j = i+1; j < n; j++) {     
               if(arr[i] > arr[j]) {    
                  int temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting 
   
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    