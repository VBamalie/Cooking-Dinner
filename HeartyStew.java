public class HeartyStew implements Meal_Cook{
    private String foodType = "Stew"; //a stew will always have a foodtype of stew
    private String cookType;

    //Setters
    public void setCookType(int choice) {// set cooktype to a limited amount of options
        switch (choice) {
            case 1:
                this.cookType = "Stovetop";
                break;
            case 2: 
                this.cookType = "Crockpot";
                break;
            default:
                this.cookType = "Error";
                break;
        }
        
    }

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
        return "We're cooking " + whatIsBeingCooked + ". It is being cooked via " + this.cookType;
    }

}
