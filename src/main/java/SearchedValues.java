import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hansenwt2 on 2/4/16.
 */
public class SearchedValues {

    public ArrayList<String> searchedValuesList;

    public SearchedValues(ArrayList<String> list) {
        setSearchedValuesList(list);
    }

    public ArrayList<String> getSearchedValuesList() {
        return searchedValuesList;
    }

    public void setSearchedValuesList(ArrayList<String> searchedValuesList) {
        this.searchedValuesList = searchedValuesList;
    }
}
