import java.util.ArrayList;
import java.util.Date;
public class MediaAdapter implements Media {
    static String SPACE = " ";
    private LittleMedia littleMedia;

    public MediaAdapter(LittleMedia littleMedia) {
        this.littleMedia = littleMedia;
    }

    public String getTitle() {
        return littleMedia.getTitle();
    }

    public Author getAuthor() {
        String author = littleMedia.getAuthor();
        String [] firstLast = author.split(SPACE, 2);
        return new Author(firstLast[0], firstLast[1]);
    }

    public String getDescription() {
        return littleMedia.getDescription();
    }

    public void addReview(String firstName, String lastName, Date date, double rating, String comment) {
        String userName = firstName + " " + lastName;
        int ratingRounded = (int)Math.round(rating);
        littleMedia.addReview(userName, date, ratingRounded, comment);
    }

    public ArrayList<Review> getReviews() {
        ArrayList<Review> reviews = new ArrayList<Review>();
        for(int i = 0; i < littleMedia.getReviews().size(); i++) {
            Review temp = new Review();
            reviews.add(new Review(littleM));
        }
        return reviews;
    }

}
