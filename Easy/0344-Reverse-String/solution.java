// ═══════════════════════════════════════════════════════
//  Problem  : 0344. Reverse String
//  URL      : https://leetcode.com/problems/reverse-string/?envType=problem-list-v2&envId=string
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.8 MB
//  Solved   : July 1, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
        while(l<r){
            char temp=s[l];
            s[r]=s[l];
            s[r]=s[l];
            l++;
            r--;
        }
    }
}