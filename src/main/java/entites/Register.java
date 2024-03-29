package entites;

public class Register {

  String userId;
  String userName;
  String orderId;
  String productId;
  double value;
  String date;

  public String getUserId() {
    return userId;
  }

  public void setUserId(final String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(final String userName) {
    this.userName = userName;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(final String orderId) {
    this.orderId = orderId;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(final String productId) {
    this.productId = productId;
  }

  public double getValue() {
    return value;
  }

  public void setValue(final double value) {
    this.value = value;
  }

  public String getDate() {
    return date;
  }

  public void setDate(final String date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "UserDto{" +
        "userId='" + userId + '\'' +
        ", userName='" + userName + '\'' +
        ", orderId='" + orderId + '\'' +
        ", productId='" + productId + '\'' +
        ", value='" + value + '\'' +
        ", date='" + date + '\'' +
        '}';
  }
}
