package huttar.net.wondrousworks.dummy;

/**
 * A dummy item representing a piece of content.
 */
public class Category {
    public final String id;
    public final String content;
    public final String details;

    public Category(String id, String content, String details) {
        this.id = id;
        this.content = content;
        this.details = details;
    }

    @Override
    public String toString() {
        return content;
    }
}
