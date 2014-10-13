public class Solution {
    
    public static String intToRoman(int number) {
        String[] romanNumerals = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] cardinalNumbers = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String romanNumber = "";
        int power = 1;

        while(number != 0) {
            
            for (int i=cardinalNumbers.length-1;i>=0;) {
            
                if(number < cardinalNumbers[i]) {
                    i--;

                } else {
                    number = number - cardinalNumbers[i];
                    romanNumber += romanNumerals[i];
                }    
            }

        }

        return romanNumber;
    }

    public static void main(String[] args) {
        int num=159;
        System.out.println(intToRoman(num));
    }

}