public class Main {

    public static void main(String[] args) {

        IdAndPasswords idAndPasswords = new IdAndPasswords();

        idAndPasswords.getLoginInfo();

        LoginPage loginPage = new LoginPage(idAndPasswords.getLoginInfo());

    }
}
