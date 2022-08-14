package example.org.repositories;

import example.org.models.Book;
import example.org.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitle(String name);

    List<Book> findByTitleOrderByYear(String name);

    List<Book> findByTitleStartingWith(String startingWith);

    List<Book> findByOwner(Person owner);

}
