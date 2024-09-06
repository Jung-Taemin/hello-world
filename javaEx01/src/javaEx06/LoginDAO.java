package javaEx06;

import java.util.HashMap;

public class LoginDAO {
    public static final String KEY_ID = "id";
    public static final String KEY_PW = "passwd";

    private String memId;
    private String memPasswd;

    public LoginDAO(){
        // 생성자에서 id, 패스워드 지정
        // 실제로는 DB에서 값을 읽어와서 비교해야...
        memId = "abcd";
        memPasswd = "1234";
    }

    public boolean loginCheck(HashMap<String, String> map){
        if (map.get(KEY_ID).equals(memId) && map.get(KEY_PW).equals(memPasswd)) {
            System.out.println("LoginDAO : 아이디와 패스워드가 일치");
            return true;
        } else {
            System.out.println("LoginDAO : 아이디와 패스워드가 불일치");
            return false;
        }
    }
}
