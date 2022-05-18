package commonUtils.customTypes;

import commonUtils.domainObjects.LoginCredential;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class LoginCredentialDataTable {

    @DataTableType
    public LoginCredential loginCredential (Map<String, String> entry) {
        return new LoginCredential(entry.get("username"),entry.get("password"));
    }
}
