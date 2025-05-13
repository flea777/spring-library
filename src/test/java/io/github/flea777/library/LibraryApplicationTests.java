package io.github.flea777.library;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class LibraryApplicationTests {

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

}
