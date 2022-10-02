package com.practice.main;

import java.util.*;

public class ArrayString {
    public static void main(String[] args) {
        ArrayString arrayString = new ArrayString();
        /*System.out.println(arrayString.lengthOfLogestSubstring(charString));
        String charString = "asdfsdfsdagggsdfdf";
        int [] nums1 = new int[]{1,2};
        int [] nums2 = new int[]{3,4};
        double medianAnswer = arrayString.findMedianSorted(nums1,nums2);
        System.out.println(medianAnswer);*/
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int [] arrayInt = new int[]{-1,0,1,2,-1,-4};
        System.out.println("arrayString.threeSum() = " + arrayString.threeSum(arrayInt));
        List  tempArray = new ArrayList();
        for (int i = 0; i < 10; i++) {
            tempArray.add(null);
        }
        System.out.println("tempArray = " + tempArray);
        Set tempSet = new HashSet();
        tempSet.addAll(tempArray);
        System.out.println("tempSet = " + tempSet);
    }
    private String getSubString(String string){
        int counter = 0;
        String output = "";
        char [] chararray = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if(output.indexOf(chararray[i])>0){

            }
        }
        return null;
    }

    private int lengthOfLogestSubstring(String charString) {
        char[] charArray = charString.toCharArray();
        return 0;
    }

    private double findMedianSorted(int[] nums1, int[] nums2) {
        double medianNumber;
        int[] combineArray = new int[nums1.length + nums2.length];
        int firstLength = nums1.length;
        for (int i = 0; i < firstLength; i++) {
            combineArray[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            combineArray[firstLength + i] = nums2[i];
        }
        Arrays.sort(combineArray);
        int combineArrayLength = combineArray.length;
        if (combineArrayLength % 2 == 0) {
            int tempIndex = combineArrayLength / 2;
            int e = combineArray[tempIndex];
            int p = combineArray[tempIndex - 1];
            medianNumber = ((e + p) / 2d);
        } else {

            medianNumber = combineArray[Math.round(combineArrayLength / 2)];
        }

        return medianNumber;
    }

    public int getNumber(String s) {
        char[] str = s.replaceAll("\\s", "").toCharArray();
        int sign = 1, base = 0, i = 0;

        // if whitespaces then ignore.
        while (str[i] == ' ') {
            i++;
        }

        // sign of number
        if (str[i] == '-' || str[i] == '+') {
            sign = 1 - 2 * (str[i++] == '-' ? 1 : 0);
        }

        // checking for valid input
        while (i < str.length
                && str[i] >= '0'
                && str[i] <= '9') {

            // handling overflow test case
            if (base > Integer.MAX_VALUE / 10
                    || (base == Integer.MAX_VALUE / 10
                    && str[i] - '0' > 7)) {
                if (sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }
            base = 10 * base + (str[i++] - '0');
        }
        return base * sign;
    }

    private static final Map<Character,
            Integer> roman = new HashMap<Character,
            Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    // This function returns value
// of a Roman symbol
    private static int romanToInt(String s) {
        int sum = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {

            // If present value is less than next value,
            // subtract present from next value and add the
            // resultant to the sum variable.
            if (i != n - 1 && roman.get(s.charAt(i)) <
                    roman.get(s.charAt(i + 1))) {
                sum += roman.get(s.charAt(i + 1)) -
                        roman.get(s.charAt(i));
                i++;
            } else {
                sum += roman.get(s.charAt(i));
            }
        }
        return sum;
    }


    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSumII(nums, i, res);
            }
        return res;
    }

    void twoSumII(int[] nums, int i, List<List<Integer>> res) {
        int lo = i + 1, hi = nums.length - 1;
        while (lo < hi) {
            int sum = nums[i] + nums[lo] + nums[hi];
            if (sum < 0) {
                ++lo;
            } else if (sum > 0) {
                --hi;
            } else {
                res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                while (lo < hi && nums[lo] == nums[lo - 1])
                    ++lo;
            }
        }
    }
}
