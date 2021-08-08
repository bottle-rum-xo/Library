public class SupplierReader extends User implements Supplier, Reader {
    public SupplierReader(String name) {
        super(name);
    }

    @Override
    public void getBook(Administrator administrator) {
        System.out.println("Поставщик" + name + "вернул книгу админу" + administrator);
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("Поставщик" + name + "вернул книгу админу" + administrator);
    }

    @Override
    public void getBooksOnLibrary(Librarian librarian) {
        System.out.println("Поставщик" + name + "привез книги библиотекарю" + librarian);
    }
}