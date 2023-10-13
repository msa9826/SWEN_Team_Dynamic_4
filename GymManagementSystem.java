public class GymManagementSystem {
    public static void main(String[] args) {
        // Create subscriptions
        Subscription annualSubscription = new Subscription("Annual Subscription", 500.0);
        Subscription monthlySubscription = new Subscription("Monthly Subscription", 50.0);

        // Create promotions

        // Create training schedules
        TrainingSchedule DefaultSchedule1 = new TrainingSchedule("Full Body Workout");
        TrainingSchedule DefaultSchedule2 = new TrainingSchedule("Cardio Intensive");
        TrainingSchedule DefaultSchedule3 = new TrainingSchedule("Yoga and Meditation");

        // Create players
        Player player1 = new Player("John Doe", false); // Regular player
        Player player2 = new Player("Guest1", true); // Guest
        
        // Set subscriptions and training schedules
        player1.setSubscription(annualSubscription);
        player1.createCustomTrainingSchedule("Legs workout");
        player1.showPlayerInfo();
        player1.applyPromotion(0.5);
        player1.showPlayerInfo();


        player2.setTrainingSchedule(DefaultSchedule3);
        
        player2.setSubscription(annualSubscription);

        // Display player information
        player1.showPlayerInfo();
        player2.showPlayerInfo();
    }
}