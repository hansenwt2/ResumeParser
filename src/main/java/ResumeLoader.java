import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

/**
 * Created by hansenwt2 on 2/4/16.
 */
public class ResumeLoader {

    public ResumeLoader(String fileName) {
        loadResumeFile(fileName);
    }

    String data = "";

    public String loadResumeFile(String fileName) {
        File file = null;
        WordExtractor extractor = null;
        try {

            file = new File(fileName);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            String[] fileData = extractor.getParagraphText();

            StringBuilder builder = new StringBuilder();
            for (String value : fileData) {
                builder.append(value);
            }

            data = builder.toString();
            data = data.replaceAll("\\s", "#");
            data = data.replaceAll("[[0-9]-+.^!@|$%&*?~`()\\/:,]","").trim();

        } catch (Exception exep) {
            exep.printStackTrace();
        }
        return data;
    }
}
