public class Purchase
{
  private int discount;
  private Date date;
  private Customer customer;
  private Pet pet;

  public Purchase(int discount,Pet pet)
  {
    this.discount = discount;
    this.pet = pet;
    this.date= null;
    this.customer = null;
  }

  public int getDiscount()
  {
    return discount;
  }
  public void setDiscount(int discount)
  {
    this.discount = discount;

  }
  public Date getDateOfPurchase()
  {
    return date;
  }
  public void setDateOfPurchase(Date date)
  {
    this.date = date;
  }
  public String toString()
  {
    return "Discount: " + discount + ", Date: " + date + ", Customer: " + customer + ", Pet: " + pet + "/n";
  }
  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Purchase other = (Purchase) obj;
    return other.getDiscount() == discount &&
        other.getDateOfPurchase().equals(date) &&
       this.pet.equals(other.pet)&&
        this.customer.equals(other.customer);
  }


}