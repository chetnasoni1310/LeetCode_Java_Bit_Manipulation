public class _2683_Derived_and_Original_Array {
      //2683
    // https://leetcode.com/problems/neighboring-bitwise-xor/description/

//GoodAPProach
// then Mast Approach

//     / If the sum is even, it means that the mismatches can be paired and resolved, allowing us to construct a valid original array.
// // If the sum is odd, it’s impossible to resolve the mismatches, and no valid original array can exist.
//         The sum of the elements in derived gives the total count of 1s in the array.

 public boolean doesValidArrayExist1(int[] derived) {
        int sum = 0;
        for (int num : derived) {
            sum += num;
        }
        return sum % 2 == 0;
    }

  // The xor-sum of the derived array should be 0 since there is always a duplicate occurrence of each element.
        // Understand that from the original element, we are using each element twice to construct the derived array

    public boolean doesValidArrayExist(int[] derived) {
        int res=0;
        for(int i:derived)
        {
            res^=i;
        }
        if(res==0)
        {
            return true;
        }
        return false;
    }
}
