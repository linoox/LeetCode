public class Solution {

    //todo: avoid string 
    public String convertToTitle(int n) {
        String title = "";
        
        while ( n > 0) {
            n--;
            char ch = (char) (n % 26 + 'A');
            n/=26;
            title=ch+title;
        }
        return title;
    }
}