package com.kannanrameshrk.raji;

import java.awt.print.Book;
import java.util.Comparator;

public abstract class BookComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.UNKNOWN_NUMBER_OF_PAGES-o2.UNKNOWN_NUMBER_OF_PAGES;
	}

}
