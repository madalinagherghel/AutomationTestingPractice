package backend.apiEngine.requests;

public class AuthorizationRequest {
    public String userName;
    public String password;
    public AuthorizationRequest(String userName, String password) {
        super();
        this.userName = userName;
        this.password = password;
    }
}
