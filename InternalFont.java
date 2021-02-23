
package eternalethiopia;
import java.awt.Font;
import java.io.InputStream;

public class InternalFont {
    public static final String Custom = "washrasbsl.ttf";

    public static Font getFont(String fontName, int style, int size) {
        Font font = null;
        try {
            InputStream fontStream = InternalFont.class.getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, fontStream);
            font = font.deriveFont(style, size);
            fontStream.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return font;
    }
}
