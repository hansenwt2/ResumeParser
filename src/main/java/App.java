import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by hansenwt2 on 2/4/16.
 */
public class App {

    public static void main(String[] args) {
        ArrayList<String> values = new ArrayList<String>();
        values.add("Wilmington");
        values.add("Nyack");
        values.add("Delaware");
        values.add("Wayne");
        values.add("C#");
        values.add("Java");
        values.add("JavaScript");
        values.add("code");
        values.add("tech");
        values.add("enterprise");
        values.add(".net");
        SearchedValues searchedValues = new SearchedValues(values);
        ResumeLoader resumeLoader = new ResumeLoader("src/main/resources/testResume1.doc");
        Resume resume = new Resume(resumeLoader.data);
        ResumeParser resumeParser = new ResumeParser();
        ParsedValues parsedValues = new ParsedValues();
        parsedValues.parsedValueList = resumeParser.parseResume(resume, searchedValues);

        System.out.println("Your search terms: \n" + values);
        if(!parsedValues.parsedValueList.isEmpty()) {
            System.out.println("Matching terms: \n" + parsedValues.parsedValueList);
        }

        float a = values.size();
        float b = parsedValues.parsedValueList.size();

        float coverage = (b * 100)/a;
        int coverageInt = (int) coverage;

        System.out.println("This resume is a " + coverageInt +"% match!");



    }
}
