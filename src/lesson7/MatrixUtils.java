package lesson7;

public class MatrixUtils {
    public static boolean isSquareMatrix (int [][] nums){
        if(nums.length == nums[0].length){
            return true;
        } else {
            return false;
        }
    }


    public static boolean isIdentityMatrix (int [][] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[j].length; j++){
                if(i == j ){
                    if(nums[i][j] != 1){
                        return false;
                    }

                }else {
                    if(nums[i][j] != 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
