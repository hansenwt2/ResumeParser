import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;


/**
 * Created by hansenwt2 on 2/4/16.
 */
public class SearchedValuesSpec {

    @Test
    public void searchedValuesConstructorTester() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        SearchedValues searchedValues = new SearchedValues(list);
        Assert.assertNotEquals("searchedValues should not be null.", null, searchedValues.getSearchedValuesList());

    }
}
