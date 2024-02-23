package JavaAssignment4;

public class SecondOccurance {
    public static void main(String[] args) {
        int [] arr = {2,3,4,2,8,7,3};
        int target = 3;
        System.out.println(findSecondOccurance(arr,target));
    }
    static int findSecondOccurance(int[] arr,int target){
        int occur = 0;
        int index = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target)
                occur++;
            if(occur == 2){
                index = i;
                break;
            }
        }
        return index;
    }
}
