package Q5;
//Write a function that doubles all the values inside the given
//        integer array and returns the array with doubled values.
//        Sample input and output:
//        Input array {1,2,3,4}
//        Output array {2,4,6,8}

public class DoubleMethod {
    public static void main(String[] args){
        int array[] ={1,2,3,4};
        for(int i=0;i<array.length;i++){ // This is the basic For loop
            System.out.println(array[i]*2+" ");
        }
// please coomment out any one of this  if your Run  this code
        for(int i:array){ //This is the advanced For loop
            System.out.println(i*2+" ");
        }
    }

}
