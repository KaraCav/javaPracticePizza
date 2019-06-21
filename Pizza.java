import java.util.*;
public class Pizza {
  private String size;
  private List<String> toppings;
  private Boolean glutenFree;
  private List<String> validSizes = new ArrayList<String>(Arrays.asList("Small", "Medium", "Large"));
  
  public Pizza() {
   this.size = "Medium";
   this.glutenFree = true;
   this.toppings = new ArrayList<String>();
  }
  
  public String getSize() {
   return this.size; 
  }
  
  public void setSize(String size) {
    this.size = size;
  }
  public Boolean getGluten() {
   return this.glutenFree; 
  }
  
  public void setGluten(Boolean glutenFree) {
    this.glutenFree = glutenFree;
  }
  
  public List<String> getToppings() {
   return this.toppings; 
  }
  
  public void setToppings(List<String> topping) {
    this.toppings = topping;
  }
  
  public void addTopping(String topping) {
    this.toppings.add(topping);
  }
  
  private Boolean checkSize(String sizeToCheck) {
    if (this.validSizes.contains(sizeToCheck)) {
      return true;
    }
    else {
      System.out.println("Please submit a valid size"); 
      return false;
    }
  }
  
}
