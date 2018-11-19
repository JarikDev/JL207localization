package resources;

import java.awt.*;
import java.util.ListResourceBundle;

public class resource_de extends ListResourceBundle {
    private static final Object[][] contents = {
            {"somevalue", "Achtung, hende hoh!!!"},
            {"backgroundColor", Color.BLACK},
            {"defaultPaperSize", new double[]{210, 297}}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
