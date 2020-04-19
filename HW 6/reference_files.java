
class Driver {
    public static void main(String args[]){
        FoodCourt foodCourt = new FoodCourt();
        foodCourt.operate();
    }
}

class Food {
    protected String customerName;
    protected String foodName;

    public Food(){
        this.customerName = new String();
        this.foodName = new String();
    }
    public Food (String foodName){
        this.customerName = new String();
        this.foodName = foodName;
    }
    public Food (String customerName, String foodName){
        this.customerName = customerName;
        this.foodName = foodName;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public void prepareFood() {
        System.out.println("Your food is being prepared.");
    }
    public String toString() {
		return "Customer Name = " + customerName + "\n" +
		       "Food Name = " + foodName + "\n";
	}
	public void printInfo() {
        System.out.println( this.toString() );		
	}
}

class FoodCourt {
    private Restaurant restaurants[];
    
    public FoodCourt() {
        this.restaurants = new Restaurant[2];
        this.restaurants[0]= new Subway("Subway");
        this.restaurants[1]= new Wendys("Wendys");
    }
    public FoodCourt(Restaurant restaurants[]) {
        this.restaurants =  restaurants;
    }    
    public void operate() {
        MyScanner myScanner = new MyScanner();

        System.out.println();

        while(true) {

            printOptions();

            System.out.print("Select a restaurant:  ");
            int choice = myScanner.readInt();
            System.out.println();

            if (choice ==0) {
                break;
            }
            else if (choice >= 1 && choice <= restaurants.length) {
                System.out.println("Welcome to " + restaurants[choice - 1].getRestaurantName() + "!");
                Food food = restaurants[choice - 1].prepareMeal();
           }
           else
                System.out.println("Please choose a valid restaurant !");
        }   
    }    
    public void printOptions() {
        System.out.println("Welcome to the Restaurant Options");
        System.out.println(" [0] to exit");

        for (int i = 0; i < restaurants.length; i++) {
            System.out.println(" [" + (i + 1) + "] to choose " + restaurants[i].getRestaurantName() ) ;
        }
    }
    public Restaurant[] getRestaurants() {
		return restaurants;
	}
    public void setRestaurants(Restaurant restaurants[]) {
		this.restaurants = restaurants;
	}
	public String toString() {
		String data = new String();
        for (int i = 0; i < restaurants.length; i++) {
		    data = data + "Restaurant #" + i + ":  " + restaurants[i] + "\n";
		}
		return data;
	}
    public void printInfo() {
        System.out.println( this.toString() );		
	}
}

class Restaurant {
    protected String restaurantName;
    
    public Restaurant() {
       this.restaurantName = new String("Restaurant");
    }
    public Restaurant(String restaurantName) {
       this.restaurantName = restaurantName;
    }
 
    public String getRestaurantName() {
        return restaurantName;
    }
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    public Food prepareMeal() {
        MyScanner myScanner = new MyScanner();
        System.out.print("What is your name:  ");
        String name = myScanner.readString();
        Food food = new Food();
        food.setCustomerName(name);
        return new Food();
    }
    public int compareTo(Restaurant restaurant) {
        return this.restaurantName.compareTo(restaurant.getRestaurantName());
    }
    public String toString() {
		return "Restaurant Name = " + restaurantName + "\n";
	}
	public void printInfo() {
        System.out.println( this.toString() );		
	}
}

/**
 * To assist you in focusing on creating classes 
 * using inheritance, here is the compareTo method
 * for the class Burger.
 * 
    public int compareTo(Burger burger) {
        if(pounds > burger.getPounds()) {
           return 1;
        }
        else if(pounds == burger.getPounds()) {
            return 0;
        }
        else {
            return -1;
        }
    }
 *
 * */
 
/**
 * To assist you in focusing on creating classes 
 * using inheritance, here is the compareTo method
 * for the class Sub.
 * 
    public int compareTo(Sub sub) {
        int origin, compare;
        if(isVeggie) 
            origin = 1;
        else origin = 0;
        
        if(sub.getIsVeggie()) 
            compare = 1;
        else compare = 0;
        
        return (origin - compare);        
    }
 **/

 /**
  * Sample output

Welcome to the Restaurant Options
 [0] to exit
 [1] to choose Subway
 [2] to choose Wendys
Select a restaurant:  1

Welcome to Subway!
What is your name:  Pete1
Would you like veggie sub (Y/N):  Y

Pete1, here's your veggie Sub.
Have a good meal!

Welcome to the Restaurant Options
 [0] to exit
 [1] to choose Subway
 [2] to choose Wendys
Select a restaurant:  2

Welcome to Wendys!
What is your name:  Pete2
How many lbs for your burger (e.g., 0.25, 0.5, 1):  0.5

Pete2, here 's your 0.5lbs Burger.
Have a good meal!

Welcome to the Restaurant Options
 [0] to exit
 [1] to choose Subway
 [2] to choose Wendys
Select a restaurant:  0

 *
 **/
