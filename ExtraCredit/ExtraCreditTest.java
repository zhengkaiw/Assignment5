/**
 * Created by zhengkevin on 2/19/17.
 */

public class ExtraCreditTest {

    public static void main(String[] args) {

        ExtraCredit ec = new ExtraCredit();

        int[] nums1 = new int[10];
        int[] nums2 = {3,5,7,9,11,13,15};
        int[][] nums3 = {{1,2,3},{4,5,6},{7,8,9}};

        nums1[0] = 1;
        nums1[1] = 4;
        nums1[2] = 6;

        ec.merge(nums1,3,nums2,7);

        System.out.println();

        System.out.println(ec.spiralOrder(nums3));
    }



}
