//1
class Iterating {

    public static void main(String[] args) {
    int[] nums = new int[201];
        for(int i = 0; i < nums.length ; i++) {
            nums = nums * 100;
            System.out.println(nums);

        }
    }
}