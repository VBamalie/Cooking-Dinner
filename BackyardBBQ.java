public class BackyardBBQ implements Meal_Cook{
    private String foodType = "BBQ";
    private String cookType;

    //GETTERS
    public String getFoodType() {
        return foodType;
    }
    public String getCookType() {
        return cookType;
    }

    //SETTERS
    public void setCookType(int choice) {
       switch (choice) {
        case 1:
            this.cookType = "Charcoal";
            break;
        case 2:
            this.cookType = "Propane Grill";
            break;
        default:
            this.cookType = "Error";
            break;
       }
    }

    public String toString() {
        return foodType + " cooked by " + cookType;
    }

    @Override
    public String cook(String whatIsBeingCooked) {
        return "We're cooking " + whatIsBeingCooked + ". It is being cooked via " + this.cookType;
    }
}
