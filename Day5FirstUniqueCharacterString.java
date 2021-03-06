/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
*/

class Day5FirstUniqueCharacterString {
    public int firstUniqChar(String s) {
    
    int count=-1;
        
    if(null == s || s.isEmpty() || s.length() < 1) {
        return -1;
    }
    else if (s.length() == 1) {
        return 0;
    }

    for(Character ch : s.toCharArray()) {
        
        if(s.indexOf(ch) == s.lastIndexOf(ch)) {
            count=s.indexOf(ch);    
            break;
        }

    }  
        
    return count;  
        
    }
}
