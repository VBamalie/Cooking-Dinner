public class ThanksgivingDinner implements Meal_Cook {
    private String foodType = "Turkey";
    private String cookType = "oven and a roasting pan";

    
    //GETTERS
    public String getFoodType() {
        return foodType;
    }


    public String getCookType() {
        return cookType;
    }

    public String toString() {
        return foodType + " cooked by " + cookType;
    }
    
    @Override
    public String cook(String whatIsBeingCooked) {
        // TODO Auto-generated method stub
        return "We're cooking " + whatIsBeingCooked + ". It is being cooked via " + this.cookType;
    }
}
