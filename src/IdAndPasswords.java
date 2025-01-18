import java.util.HashMap;

public class IdAndPasswords {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IdAndPasswords() {

        loginInfo.put("username1", "admin1");
        loginInfo.put("username2", "admin2");
        loginInfo.put("username3", "admin3");

    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
