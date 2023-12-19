class Solution {
    public int lengthOfLongestSubstring(String S) {HashSet<Character> word =new HashSet<>();
    int i=0;
    int j=0;
    int max=0;
    HashSet<Character> my =new HashSet<>();
    while(j<S.length()){
        if(!my.contains(S.charAt(j))){
            my.add(S.charAt(j));
            j++;
            max=Math.max(my.size(),max);
        }
        else{
            my.remove(S.charAt(i));
            i++;

        }

    }
    return max;

        
    }
}
