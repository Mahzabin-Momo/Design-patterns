public class Task1_singleResponsibility {
    public void login(String username, String password) {
        // System.out.printf("Login service");
    }

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        emailService.sendEmail("MOMO", "BILL", "MOMO");
    }
}

class EmailService {
    public void sendEmail(String to, String subject, String body) {
        System.out.printf("Email service");
    }
}
