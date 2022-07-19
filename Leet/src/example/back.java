package example;

import java.util.ArrayList;
import java.util.List;

//给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
public class back {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backTrack(nums, path, result);
        return result;
    }

    private static void backTrack(int[] nums, List<Integer> path, List<List<Integer>> ans) {
        if (path.size() == nums.length) {

            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i < nums.length; i ++) {
            if (!path.contains(nums[i])) {
                path.add(nums[i]);
                backTrack(nums, path, ans);
                path.remove(path.size() - 1);
            }
        }

    }


    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3};
        List<List<Integer>> list = permute(arr);
        System.out.println(list.toString());
    }

}
