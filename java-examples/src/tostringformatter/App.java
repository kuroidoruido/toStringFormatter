package tostringformatter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import tostringformatter.book.Author;
import tostringformatter.book.Book;
import tostringformatter.complete.BeanOne;
import tostringformatter.complete.BeanThree;
import tostringformatter.complete.BeanTwo;

public class App {
	public static void main(String[] args) {
		Book book1 = new Book("The Hitchhiker's Guide to the Galaxy", LocalDate.of(1979, 10, 12));
		Book book2 = new Book("The Restaurant at the End of the Universe", LocalDate.of(1980, 10, 1));
		Book book3 = new Book("Life, the Universe and Everything", LocalDate.of(1982, 8, 1));
		Book book4 = new Book("So Long, and Thanks for All the Fish", LocalDate.of(1984, 11, 1));
		Book book5 = new Book("Mostly Harmless", LocalDate.of(1992, 1, 1));
		
		Author author = new Author("Douglas", "Adams", LocalDate.of(1952, 3, 11), new ArrayList<Book>());
		author.getBookWriten().add(book1);
		author.getBookWriten().add(book2);
		author.getBookWriten().add(book3);
		author.getBookWriten().add(book4);
		author.getBookWriten().add(book5);
		
		System.out.println(book1.toString());
		System.out.println(author.toString());
		
		BeanOne beanOne1 = new BeanOne("str1",42);
		BeanOne beanOne2 = new BeanOne("str2",43);
		BeanOne beanOne3 = new BeanOne("str3",44);
		BeanOne beanOne4 = new BeanOne("str4",45);
		
		BeanTwo beanTwo1 = new BeanTwo(new ArrayList<BeanOne>());
		beanTwo1.getPropBean2().add(beanOne1);
		beanTwo1.getPropBean2().add(beanOne2);
		
		BeanTwo beanTwo2 = new BeanTwo(new ArrayList<BeanOne>());
		beanTwo2.getPropBean2().add(beanOne3);
		beanTwo2.getPropBean2().add(beanOne4);
		
		BeanThree beanThree = new BeanThree(new HashMap<String,BeanTwo>());
		beanThree.getPropMap().put("beanTwo1", beanTwo1);
		beanThree.getPropMap().put("beanTwo2", beanTwo2);
		
		System.out.println(beanThree);
	}
}
