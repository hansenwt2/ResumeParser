import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by hansenwt2 on 2/4/16.
 */
public class ResumeParser {

    HashSet<String> parsedValuesTemp = new HashSet<String>();

    public ArrayList<String> parseResume(Resume resume, SearchedValues searchedValues) {
        ArrayList<String> comparator = new ArrayList<String>();
        ArrayList<String> dataList = new ArrayList<String>();
        String[] tempStringArray = resume.getResumeContent().split("#");
        for(String string: tempStringArray) {
            if(!string.isEmpty())
                dataList.add(string);
        }

        for(int i = 0; i < searchedValues.searchedValuesList.size(); i++) {
            if(dataList.contains(searchedValues.searchedValuesList.get(i))){
                comparator.add(searchedValues.searchedValuesList.get(i));
            }
        }
        int count = 0;
        for (String string: dataList) {
            System.out.println(count + ": " + string);
            count++;
        }
        return comparator;
    }
}
