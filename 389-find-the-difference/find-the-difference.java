class Solution {
    public char findTheDifference(String s, String t) {
        int i = 0;
        int sum = 0;
        while(i < s.length()){
            sum = sum + t.charAt(i) - s.charAt(i);
            i++;  
        }
        sum = sum + t.charAt(i);
        return (char)sum;

        // while(i < s.length()){
        //     sum = sum ^ s.charAt(i);
        //     sum = sum ^ t.charAt(i);
        //     i++;
        // }
        // sum = sum + t.charAt(i);
        // return (char)sum;
    }
}