package murari.besocial.domain.models.bindingModels;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import murari.besocial.utils.constants.ValidationMessageConstants;
import murari.besocial.validations.annotations.Password;

import java.io.Serializable;

public class UserLoginBindingModel implements Serializable {
    private String username;
    private String password;

    public UserLoginBindingModel() {
    }

    @Pattern(regexp = "^([a-zA-Z0-9]+)$")
    @Size(min = 4, max = 16, message = ValidationMessageConstants.INVALID_CREDENTIALS_MESSAGE)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Password(minLength = 4, maxLength = 16, containsOnlyLettersAndDigits = true, message = ValidationMessageConstants.INVALID_CREDENTIALS_MESSAGE )
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
