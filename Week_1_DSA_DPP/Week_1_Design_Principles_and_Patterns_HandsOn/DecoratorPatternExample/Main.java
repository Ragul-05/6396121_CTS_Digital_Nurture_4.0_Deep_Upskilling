package Week_1_Design_Principles_and_Patterns_HandsOn.DecoratorPatternExample;


public class Main {
    public static void main(String[] args) {
        // Base notifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate with SMS
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Further decorate with Slack
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send message via all channels
        slackNotifier.send("System maintenance scheduled at 9 PM.");
    }
}