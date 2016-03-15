import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by hansenwt2 on 2/4/16.
 */
public class Resume {

    private String resumeContent;
    private double percentageMatch;
    private int rating;

    public Resume() {
        new Resume();
    }

    public Resume(String resumeContent) {
        this.resumeContent = resumeContent;
    }

    public String getResumeContent() {
        return resumeContent;
    }

    public void setResumeContent(String resumeContent) {
        this.resumeContent = resumeContent;
    }

    public double getPercentageMatch() {
        return percentageMatch;
    }

    public void setPercentageMatch(double percentageMatch) {
        this.percentageMatch = percentageMatch;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
