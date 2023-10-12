import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("The Brothers Karamazov", "Fyodor Dostoevsky", 824, 1880);
        Book b2 = new Book("The Death of Ivan Ilyich", "Leo Tolstoy", 92, 1886);
        Book b3 = new Book("Hunger", "Knut Hamsun", 176, 1890);
        Book b4 = new Book("Guns, Germs, and Steel", "Jared Diamond", 480, 1997);
        Book b5 = new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 443, 2011);

        TreeSet<Book> bookTreeSet = new TreeSet<>();

        bookTreeSet.add(b1);
        bookTreeSet.add(b2);
        bookTreeSet.add(b3);
        bookTreeSet.add(b4);
        bookTreeSet.add(b5);

        System.out.println("Sorted by Book Name");
        System.out.println("---------------------------");

        for (Book book : bookTreeSet) {
            System.out.println(book.toString());
        }

        System.out.println("#######################################");
        TreeSet<Book> bookTreeSet2 = new TreeSet<>(new PageComparator());

        bookTreeSet2.add(b1);
        bookTreeSet2.add(b2);
        bookTreeSet2.add(b3);
        bookTreeSet2.add(b4);
        bookTreeSet2.add(b5);

        System.out.println("Sorted by Number of Pages");
        System.out.println("---------------------------");


        for (Book book : bookTreeSet2) {
            System.out.println(book.toString());
        }
    }
}
