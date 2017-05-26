package tostringformatter.book;

import java.time.LocalDate;

public class Book {
	private String title;
	private LocalDate publishedYear;

	public Book() {
		super();
	}

	public Book(String title, LocalDate publishedYear) {
		super();
		this.title = title;
		this.publishedYear = publishedYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(LocalDate publishedYear) {
		this.publishedYear = publishedYear;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", publishedYear=" + publishedYear + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((publishedYear == null) ? 0 : publishedYear.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (publishedYear == null) {
			if (other.publishedYear != null)
				return false;
		} else if (!publishedYear.equals(other.publishedYear))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
}
