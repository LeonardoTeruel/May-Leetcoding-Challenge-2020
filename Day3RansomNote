/* 
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true

*/

class Day3RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if (null == ransomNote || ransomNote.isEmpty()) { 
            return true; 
        }
        
        else if (null == magazine || magazine.isEmpty()) { 
            return false; 
        }
        
        int counter = 0;
        StringBuilder stringBuilderMagazine = new StringBuilder(magazine);
        
        for (int indiceRansomNote=0; indiceRansomNote< ransomNote.length(); indiceRansomNote++) {
            
            char characterFromRansomNote = ransomNote.charAt(indiceRansomNote);
            
            for (int indiceMagazineFor=0; indiceMagazineFor< stringBuilderMagazine.length();        indiceMagazineFor++){
                
                char characterMagazine = stringBuilderMagazine.charAt(indiceMagazineFor); 
                
                if (characterFromRansomNote == characterMagazine){
                    
                    stringBuilderMagazine.deleteCharAt(indiceMagazineFor);
                    counter++;
                    break; 
                }
            }
        }
        
        if (ransomNote.length() == counter){
            return true;
        }
        else {
            return false;
        }
           
    }
}
