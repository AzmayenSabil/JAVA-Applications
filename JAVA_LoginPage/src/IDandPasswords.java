import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IDandPasswords(){
        loginInfo.put("admin","admin");
    }

    protected HashMap getLoginInfo(){
        return loginInfo;
    }

}
