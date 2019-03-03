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

    @Test (description = "Using Java's built-in reverse() function of the StringBuilder Class")
    public void reverseStringStringBuilder(){
        reversedString = new ReverseString().reverseStringBuilder(inputString);
        Assert.assertEquals(reversedString, expectedString);
    }

    @Test (description = "Using CharAt() method of the Sting Class")
    public void reverseStringCharAt(){
        reversedString = reverseCharAt(inputString);
        Assert.assertEquals(reversedString, expectedString);
    }

    @Test (description = "Using CharArray method")
    public void reverseStringCharArray(){
        reversedString = reverseStringToCharArray(inputString);
        Assert.assertEquals(reversedString, expectedString);
    }

    @Test
    public void allMethods(){
        Assert.assertEquals(this.stringBuilder(inputString), expectedString);
        Assert.assertEquals(this.charAt(inputString), expectedString);
        Assert.assertEquals(this.charArray(inputString), expectedString);
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


    private  String stringBuilder(String inputString){
        return new StringBuilder(inputString).reverse().toString();
    }
    private String charAt(String inputString){
        StringBuilder reversedString = new StringBuilder();

        for (int i = inputString.length()-1; i>=0; i --){
            reversedString.append(inputString.charAt(i)).toString();
        }
        return reversedString.toString();
    }

    private String charArray(String inputString){
        String reversedString = "";
        for (char c : inputString.toCharArray()){
            reversedString = c + reversedString;
        }
        return reversedString;
    }

}
