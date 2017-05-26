package tostringformatter.book;

import java.time.LocalDate;
import java.util.List;

public class Author {
	private String lastname;
	private String firstname;
	private LocalDate birth;
	private List<Book> bookWriten;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String lastname, String firstname, LocalDate birth, List<Book> bookWriten) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.birth = birth;
		this.bookWriten = bookWriten;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	public List<Book> getBookWriten() {
		return bookWriten;
	}

	public void setBookWriten(List<Book> bookWriten) {
		this.bookWriten = bookWriten;
	}

	@Override
	public String toString() {
		return "Author [lastname=" + lastname + ", firstname=" + firstname + ", birth=" + birth + ", bookWriten="
				+ bookWriten + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
		result = prime * result + ((bookWriten == null) ? 0 : bookWriten.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
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
		Author other = (Author) obj;
		if (birth == null) {
			if (other.birth != null)
				return false;
		} else if (!birth.equals(other.birth))
			return false;
		if (bookWriten == null) {
			if (other.bookWriten != null)
				return false;
		} else if (!bookWriten.equals(other.bookWriten))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}

}
