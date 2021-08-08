public class LibrarianAdministrator extends User implements Administrator, Librarian {
    public LibrarianAdministrator(String name) {
        super(name);
    }

    @Override
    public void overDueNotification(Reader reader) {
        System.out.println("Администратор " + name + "обнаружил просрочку возврата книг у пользователя " + reader);
    }

    @Override
    public void orderBook(Supplier supplier) {
        System.out.println("Библиотекарь " + name + "заказал книги у поставщика " + supplier);
    }

    @Override
    public void receiveBook(Supplier supplier) {
        System.out.println("Библиотекарь " + name + "получил книги от поставщика " + supplier);
    }
}