package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IsValidStringTests {

    @Test
    void testIsValid() {
        assertEquals("NO", IsValidString.isValid("aaaabbcc")); 
    }

    @Test
    void testIsValid1() {
        assertEquals("NO", IsValidString.isValid("aabbcd")); 
    }

    @Test
    void testIsValid2() {
        assertEquals("NO", IsValidString.isValid("aaabbbccde")); 
    }

    @Test
    void testIsValid3() {
        assertEquals("NO", IsValidString.isValid("aaabbbccd")); 
    }

    @Test
    void testIsValid4() {
        assertEquals("YES", IsValidString.isValid("aaabbbcc")); 
    }

    @Test
    void testIsValid5() {
        assertEquals("NO", IsValidString.isValid("aabbcd")); 
    }    
    
    @Test
    void testIsValid6() {
        assertEquals("YES", IsValidString.isValid("abcdefghhgfedecba")); 
    }    

    @Test
    void testIsValid7() {
        assertEquals("YES", IsValidString.isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd")); 
    }
}
