package resources;

import java.awt.*;
import java.util.ListResourceBundle;

public class resource_ru extends ListResourceBundle {
    private static final Object[][]contents={
            {"somevalue","Водка матрёшка балалайка"},{"backgroundColor", Color.BLACK},{"defaultPaperSize",new double[]{210,297}}
    };
    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
