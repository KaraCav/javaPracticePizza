public Class PizzaOrder { 
  public static void main(String[] args){
    Scanner getOrderInfo = new Scanner(System.in);
     System.out.println("Choose a size"); 
     String userSize = getOrderInfo.nextLine();
     System.out.println("Would you like a gluten free pizza? Yes/ No"); 
     String userIsGlutenFree = getOrderInfo.nextLine();
     System.out.println("You chose a " + userSize + "and said " + userIsGlutenFree + " to needing gluten free.");
    }
  }
