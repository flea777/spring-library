package io.github.flea777.library;

import io.github.flea777.library.model.entities.Book;
import io.github.flea777.library.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class LibraryApplicationTests {

	@Autowired
	private BookRepository bookRepository;

	@Test
	void stringShouldNotBeEmpty() {
		String testString = "Hello, Library!";
		assertFalse(testString.isEmpty(), "The string should not be empty");
	}

	@Test
	void listShouldContainElement() {
		java.util.List<String> list = java.util.Arrays.asList("Book", "Author", "Publisher");
		assertTrue(list.contains("Author"), "The list should contain 'Author'");
	}

	@Test
	void shouldSaveAndRetrieveBook() {
		Book book = new Book();
		book.setName("Spring Boot in Action");
		book.setAuthor("Craig Walls");
		book.setIsbn("123456789");
		book.setPublisher("Manning");

		bookRepository.save(book);

		Book retrievedBook = bookRepository.findById(book.getId()).orElse(null);

		assertNotNull(retrievedBook, "O livro não deve ser nulo");
		assertEquals("Spring Boot in Action", retrievedBook.getName(), "O nome do livro deve ser igual");
		assertEquals("Craig Walls", retrievedBook.getAuthor(), "O autor do livro deve ser igual");
	}

}
