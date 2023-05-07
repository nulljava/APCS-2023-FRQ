/**
 * The Sign class constructor has two parameters. The first parameter is a String that contains the
 * message to be displayed on the sign. The second parameter is an int that contains the width of each line of
 * the sign. The width is the positive maximum number of characters that can be displayed on a single line of the
 * sign.
 * 
 * A sign contains as many lines as are necessary to display the entire message. The message is split among the
 * lines of the sign without regard to spaces or punctuation. Only the last line of the sign may contain fewer
 * characters than the width indicated by the constructor parameter.
 * 
 * In addition to the constructor, the Sign class contains two methods.
 * 
 * The numberOfLines method returns an int representing the number of lines needed to display the
 * text on the sign. In the previous examples, numberOfLines would return 3, 2, and 1, respectively,
 * for the sign widths shown in the table.
 * 
 * The getLines method returns a String containing the message broken into lines separated by
 * semicolons (;) or returns null if the message is the empty string. The constructor parameter that
 * contains the message to be displayed will not include any semicolons. As an example, in the first row of the
 * preceding table, getLines would return "Everything on s;ale, please com;e in".
 * No semicolon should appear at the end of the String returned by getLines.
 */

public class Sign{

    private String text;
    private int width;

    public Sign(String signText, int signWidth){
        this.text = signText;
        this.width = signWidth;
    }

    public int numberOfLines(){
        if(text.length() == 0){
            return 0;
        }else{
            return (text.length / width) + 1;
        }
    }

    public String numberOfLines(){
        if(text.length() == 0){
            return null;
        }else{
            int startStr = 0;
            int endStr = width;
            String lines = "";
            for(int i = 0; i<numberOfLines(); i++){
                lines += text.substring(startStr, endStr);
                lines += ";";
                startStr += width;
                endStr += width;
            }
            lines += text.substring(startStr);
            return lines;
        }
    }

}