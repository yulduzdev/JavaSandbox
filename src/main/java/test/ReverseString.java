package test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yulduzetta on 3/3/19.
 */
public class ReverseString {

    String inputString = "Yulduz";
    String expectedString = "zudluY";
    String reversedString = null;

    @Test
    public void reverseStringsUsingAllMethods(){
        Assert.assertEquals(this.reverseStringBuilder(inputString), expectedString);
        Assert.assertEquals(this.reverseCharAt(inputString), expectedString);
        Assert.assertEquals(this.reverseStringToCharArray(inputString), expectedString);
    }

    /**
     * Using Java's built-in reverse() function of the StringBuilder Class
     * @param inputString
     * @return
     */
    private String reverseStringBuilder(String inputString){
        return new StringBuilder(inputString).reverse().toString();
    }

    /**
     * Using CharAt() method of the Sting Class
     */
    private  String reverseCharAt(String inputString){
        StringBuilder reversedString = new StringBuilder();

        for(int i=inputString.length()-1; i>=0; i--){
            System.err.println(reversedString.append(inputString.charAt(i)).toString());
        }
        return reversedString.toString();
    }

    /**
     * Using CharArray method
     * @param inputString
     * @return
     */
    private String reverseStringToCharArray(String inputString){
        String reversedString = "";
        for(char i: inputString.toCharArray()){
            reversedString = i + reversedString;
            System.err.println("current value: " + reversedString);
        }
        return reversedString;
    }

}
