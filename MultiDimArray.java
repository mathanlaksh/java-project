public class MultiDimArray {
    public static void main(String[] args) {
        int nums[][][] = new int[3][4][5]; //three dimensional array
        int random = 0;
        for (int i = 0; i < 3; i++) {
            for(int j=0; j<4;j++) {
                for(int k=0;k<4;k++) {
                nums[i][j][k] = (int)(Math.random()*100);

                System.out.print(nums[i][j][k]+" ");
                }
            } System.out.println();
        }

    }
}
