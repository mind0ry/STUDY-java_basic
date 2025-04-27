package poly.ex;

public class SendMain {

    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FacebookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("횐영합니다!");
        }
    }
}
