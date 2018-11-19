package resources;

import java.awt.*;
import java.util.ListResourceBundle;

public class resource extends ListResourceBundle {
    private static final Object[][]contents={
            {"somevalue","This is english text"},{"backgroundColor", Color.BLACK},{"defaultPaperSize",new double[]{210,297}}
    };
    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
