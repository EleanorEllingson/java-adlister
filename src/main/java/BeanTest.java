import models.Album;
import models.Author;
import models.Quote;

import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args){
        Album album = new Album();

        album.setArtist("Alabama");
        album.setReleaseDate(1995);
        album.setGenre("Country");
        album.setSales(5.4);

        System.out.println("Album = " + album.getArtist());

        Author author = new Author();

        author.setId(1L);
        author.setFirstName("Westley");
        author.setLastName("Farmboy");

        Quote firstQuote = new Quote();
        firstQuote.setId(1L);
        firstQuote.setAuthor(author);
        firstQuote.setContent("As you wish");

        Quote secondQuote = new Quote();
        secondQuote.setId(2L);
        secondQuote.setAuthor(author);
        secondQuote.setContent("Life is pain!");


        System.out.println("quote.getContent() = " + firstQuote.getContent());
        System.out.println("quote.getAuthor() = " + firstQuote.getAuthor().getFirstName());


        ArrayList<Quote> quotes = new ArrayList<>();
            quotes.add(firstQuote);
            quotes.add(secondQuote);

            for(Quote q: quotes) {
                System.out.println("quote.getContent() = " + q.getContent());
                System.out.println("quote.getAuthor().getFirstName() = " + q.getAuthor().getFirstName());
                System.out.println("quote.getAuthor().getLastName() = " + q.getAuthor().getLastName());
            }
    }
}
