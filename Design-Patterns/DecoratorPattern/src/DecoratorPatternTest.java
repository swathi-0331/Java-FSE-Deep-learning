public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Base Notifier
        Notifier notifier = new EmailNotifier();

        // Add SMS functionality
        notifier = new SMSNotifierDecorator(notifier);

        // Add Slack functionality
        notifier = new SlackNotifierDecorator(notifier);

        // Send notification via Email, SMS, and Slack
        notifier.send("System maintenance scheduled at 10 PM tonight.");
    }
}
