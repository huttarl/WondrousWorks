package huttar.net.wondrousworks.dummy;

import android.content.Context;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import huttar.net.wondrousworks.R;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class Categories {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Category> ITEMS = new ArrayList<Category>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Category> ITEM_MAP = new HashMap<String, Category>();

    private static final int COUNT = 25;

    public Categories(Context context) {
        InputStream is = context.getResources().openRawResource(R.raw.properties);
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(Category item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static Category createDummyItem(int position) {
        return new Category(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

}
