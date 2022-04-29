import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class ReadingJson {

  public static void main(String[] args) {

    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    String line = "0000000070;Palmer Prosacco;0000000753;0000000003;1836.74;20210308";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

    User user = new User();
    Order order = new Order();
    Product product = new Product();
    Product product1 = new Product();
    Product product2 = new Product();

    List<String> split = Arrays.asList(line.split(";"));
    List<Product> products = new ArrayList<>();
    List<Order> orders = new ArrayList<>();

    String userid = StringUtils.stripStart(split.get(0), "0");
    String username = split.get(1);
    String orderid = StringUtils.stripStart(split.get(2), "0");
    String productid = StringUtils.stripStart(split.get(3), "0");
    double value = Double.valueOf(split.get(4));
    String date = LocalDate.parse(split.get(5), formatter).toString();

    product.setProduct_id(Integer.valueOf(productid));
    product.setValue(value);

    product1.setProduct_id(Integer.valueOf(productid));
    product1.setValue(value);

    product2.setProduct_id(Integer.valueOf(productid));
    product2.setValue(value);

    products.add(product);
    products.add(product1);
    products.add(product2);

    double total = 0;
    for (int i = 0; i < products.size(); i++) {

      total = products.get(i).getValue() + total;
    }

    order.setProducts(products);
    order.setTotal(total);
    order.setOrder_id(Integer.valueOf(orderid));
    order.setData(date);
    orders.add(order);

    user.setOrders(orders);
    user.setUserName(username);
    user.setUserId(Integer.valueOf(userid));

    String json = gson.toJson(user);

    System.out.println(json);
  }
}