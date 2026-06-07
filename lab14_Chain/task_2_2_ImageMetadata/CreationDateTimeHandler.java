import java.text.SimpleDateFormat;
import java.util.Date;

public class CreationDateTimeHandler extends ImageAttributeHandler {
    @Override
    protected void process(Image image) {
        Date now = new Date();

        if (image.getCreationTime() == null || image.getCreationTime().isBlank()) {
            String time = new SimpleDateFormat("HHmmss").format(now);
            image.setCreationTime(time);
        }

        if (image.getCreationDate() == null || image.getCreationDate().isBlank()) {
            String date = new SimpleDateFormat("yyyyMMdd").format(now);
            image.setCreationDate(date);
        }
    }
}
