package Practice;// Given an integer array, remove duplicates and print unique elements.


public class Remove_Duplicate {
    public static void main(String[] args) {
      int [] arr= {1,2,3,6,4,3,2,4,3,2,4,2,4,3,2,5,3,5,33,5,4,6,433,2,2,43,4,55,6,3,8,2};
      System.out.println("Unique elements are: ");
      for(int i=0;i<arr.length;i++){
          boolean isDupe=false;

          for(int j=0;j<i;j++){
              if(arr[i]==arr[j]){
                  isDupe=true;
                  break;
              }
          }
          if(!isDupe){
              System.out.println(arr[i]);
          }
      }
    }
}
