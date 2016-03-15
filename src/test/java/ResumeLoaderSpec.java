import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hansenwt2 on 2/4/16.
 */
public class ResumeLoaderSpec {

    @Test
    public void loadResumeFileTester() {
        ResumeLoader resumeLoader = new ResumeLoader("src/main/resources/tester.doc");
        Assert.assertEquals("resumeLoader.data should return 'test document.'", "test document", resumeLoader.data);
    }

}
