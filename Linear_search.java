public class Linear_search{
    public static void main(String[] args) {

        int[] arr = {21, 23, 45, 67, 88};
        int target = 45;
        System.out.println(linearSearch(arr,target));

    }

    static int linearSearch (int arr[], int target){

        if(arr.length == 0){
            return -1;
        }
        else{

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target){
                    return i;
                }

            }
        }
        return -1;
    }
}
