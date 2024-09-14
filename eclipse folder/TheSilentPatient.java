package com.xworkz.books.boot;

public class TheSilentPatient {
	
	public String author;
	
	public float price;
	
	public long isbn10;
	
	public int printLength;
	
	public Publisher publisher;
	
	
	


	public TheSilentPatient(String author, float price, long isbn10, int printLength, Publisher publisher) {
		
		this.author = author;
		
		this.price = price;
		
		this.isbn10 = isbn10;
		
		this.printLength = printLength;
		
		this.publisher = publisher;
	         
	}





	public String getAuthor() {
		return author;
	}

    public float getPrice() {
		return price;
	}

    public long getIsbn10() {
		return isbn10;
    }

    public int getPrintLength() {
		return printLength;
	}

    public Publisher getPublisher() {
		return publisher;
	}




		
	
}
