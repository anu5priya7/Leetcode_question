 // class Solution {
    //     public int lengthOfLongestSubstring(String s) {
    
    //         Set<Character> set = new HashSet<>();
    //         int maxLength =0;
    //         int left =0;
    //         for(int right =0; right<s.length(); right++){
    
    //             if(!set.contains(s.charAt(right))){
    //                 set.add(s.charAt(right));
    //                 maxLength = Math.max(maxLength, right-left+1);
    //             }else{
    //              while(s.charAt(left) != s.charAt(right)){
    //                  set.remove(s.charAt(left));
    //                  left++;
    //              }
    //               set.remove(s.charAt(left));
    //               left++;
    
    //               set.add(s.charAt(right));
    
    //             }
    //         }
            
    //         return maxLength;
    //     }
    // }
    
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            
     
            StringBuilder sb = new StringBuilder();
            int i=0;
            int count=0;
            while(i<s.length())
            {
                
                for(int j=0;j<sb.length();j++)
                {
                    if(sb.charAt(j)==s.charAt(i))
                        sb.delete(0,j+1);
                }
                
                sb.append(s.charAt(i));
                if(sb.length()>=count)
                   count=sb.length();
                i++;
            }
            
            return count;
        }
    } {
    
}
