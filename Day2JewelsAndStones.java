/* You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct. */

class Day2JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
       
        int counter = 0; 
        
        for (int firstIndice=0; firstIndice<S.length(); firstIndice++) {

            char characterIHave = S.charAt(firstIndice);

            for (int secondIndice=0; secondIndice<J.length(); secondIndice++ ) {
                
                char characterJeweler = J.charAt(secondIndice);
                
                if (characterIHave == characterJeweler) {
                counter ++; 
                }
            }                    
        }
        
        return counter;
    }
}
