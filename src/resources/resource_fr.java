package resources;

import java.awt.*;
import java.util.ListResourceBundle;

public class resource_fr  extends ListResourceBundle {
    private static final Object[][]contents={
            {"somevalue","Je le mansh spas sis jur"},{"backgroundColor", Color.BLACK},{"defaultPaperSize",new double[]{210,297}}
    };
    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
