public class Test {
    public static void main(String[] args) {
        UserAdmin userAdmin = new UserAdmin("Kolin");
        SupplierReader supplierReader = new SupplierReader("Tom");
        LibrarianAdministrator adminLibrar = new LibrarianAdministrator("Kate");

        userAdmin.overDueNotification(supplierReader);
        supplierReader.getBook(userAdmin);
        supplierReader.returnBook(userAdmin);
        adminLibrar.orderBook(supplierReader);
    }
}
