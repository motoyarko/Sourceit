/**
 * Created by motoyarko on 06-Jul-15.
 */
public class Selectors {
    public static String username = "#Email";
    public static String nextButton = "#next";
    public static String password = "#Passwd";
    public static String signin = "#signIn";
    public static String inputMessages = "span a[href=\"https://mail.google.com/mail/u/0/#inbox\"]";
    public static String markedMessages = "span a[href*=\"https://mail.google.com/mail/u/0/#starred\"]";
    public static String importantMessages = "span a[href*=\"https://mail.google.com/mail/u/0/#imp\"]";
    public static String sendMessages =  "span a[href*=\"https://mail.google.com/mail/u/0/#sent\"]";
    public static String draftMessages = "span a[href*=\"https://mail.google.com/mail/u/0/#drafts\"]";
    public String usernameEmail;
    public String passwordEmail;

    public String getPasswordEmail() {
        return passwordEmail;
    }

    public void setPasswordEmail(String passwordEmail) {
        this.passwordEmail = passwordEmail;
    }

    public String getUsernameEmail() {
        return usernameEmail;
    }

    public void setUsernameEmail(String usernameEmail) {
        this.usernameEmail = usernameEmail;
    }



}
