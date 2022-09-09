package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        Book b4 = new Book();
        Book[] books = new Book[4];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        books[3] = b4;
        b4.setTitle("Clean code");
        b4.setPages(111);
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println("Book " + bk.getTitle() + ", " + bk.getPages());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println("Book " + bk.getTitle() + ", " + bk.getPages());
        }
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if ("Clean code".equals(bk.getTitle())) {
                System.out.println("Book " + bk.getTitle() + ", " + bk.getPages());
            }
        }
    }
}
