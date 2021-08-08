public class UserAdmin extends User implements Administrator {
    public UserAdmin(String name) {
        super(name);
    }

    @Override
    public void overDueNotification(Reader reader) {
        System.out.println("Администратор" + name + "обнаружил просрочку возврата книг у пользователя " + reader);

    }
}