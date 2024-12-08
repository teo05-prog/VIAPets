package model.Pets;

public class Rodent extends Pet
{
  private boolean doesItBite;

  public Rodent(String name, int age, String colour, char gender,
      String comment, int price, boolean doesItBite)
  {
    super(name, age, colour, gender, comment);
    this.doesItBite = doesItBite;
  }

  public boolean getDoesItBite()
  {
    return doesItBite;
  }

  public void setDoesItBite()
  {
    this.doesItBite = doesItBite;
  }

  public Pet copy()
  {
    return new Rodent(super.getName(), getAge(), getColour(), getGender(),
        getComment(), getPrice(), getDoesItBite());
  }

  public String toString()
  {
    return "model.Pets.model.Pets.Rodent: " + super.toString() + ", does it bite?: " + doesItBite
        + "/n";
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Rodent other = (Rodent) obj;
    return other.getName().equals(super.getName())
        && other.getAge() == super.getAge() && other.getColour()
        .equals(super.getColour()) && other.getGender() == super.getGender()
        && other.getComment().equals(super.getComment())
        && other.getPrice() == super.getPrice()
        && other.getDoesItBite() == doesItBite;
  }
}
