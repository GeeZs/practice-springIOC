package first.spring.practice;

public class InternetMessageProvider implements MessageProvider{

    public String getMessage() {
        return "Message from internet!";
    }
}
