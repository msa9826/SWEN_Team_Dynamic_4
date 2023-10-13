class Player {
    private String name;
    private boolean isGuest;
    private Subscription subscription;
    private TrainingSchedule trainingSchedule;
    private double payment;

    public Player(String name, boolean isGuest) {
        this.name = name;
        this.isGuest = isGuest;
    }

    public void setSubscription(Subscription subscription) {
        if (isGuest) {
            System.out.println("you are a guest, no subsciption plan needed");
        }
        else{
            this.payment = subscription.getPrice();
            this.subscription = subscription;
        }

    }

    

    public double applyPromotion(double discount) {
        return payment - (payment * (1 - discount));
    }

    public Subscription getSubscription(){
        return this.subscription;
    }

    public void setTrainingSchedule(TrainingSchedule trainingSchedule) {
        if (!isGuest) {
            this.trainingSchedule = trainingSchedule;
        }
    }

    public void createCustomTrainingSchedule(String scheduleName) {
        if (!isGuest) {
            this.trainingSchedule = new TrainingSchedule(scheduleName);
        }
    }

    public void showPlayerInfo() {
        System.out.println("Name: " + name);
        if (subscription != null) {
            System.out.println("Subscription: " + subscription.getName());
            System.out.println(subscription.getPrice());
        }
        else{
            System.out.println("Is Guest: " + isGuest);
        }

        if (trainingSchedule != null) {
            System.out.println("Training Schedule: " + trainingSchedule.getName());
        }
    }
}