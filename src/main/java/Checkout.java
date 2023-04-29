import java.util.List;

public class Checkout {
  public Double calculateTotal(String state, List<Item> items ){
    Double total = 0.0;
    if(state!=""){
      for(Item item : items){
        if(state == "PA"){
          if(item.type == "Clothing" || item.type == "Wic Eligible food"){
            total = total + item.price;
          }
          else{
            total = total + item.price + item.price * 0.06;
          }
        }
        else if(state == "NJ"){
          if(item.type == "Wic Eligible food" || item.type == "Clothing" && !item.name.contains("fur")){
            total = total + item.price;
          }
          else{
            total = total + item.price + item.price * 0.066;
          }
        }
        else{
          total = total + item.price;
        }
      }
    }
    return total;
  }
}
