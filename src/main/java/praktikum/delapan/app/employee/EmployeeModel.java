package praktikum.delapan.app.employee;

import praktikum.delapan.app.car.Car;

public final class EmployeeModel {
  private final String firstName;
  private final String lastName;
  private final String SSN;
  private final String address;
  private final Car car;

  public EmployeeModel(String firstName, String lastName, String SSN, String address, Car car) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.SSN = SSN;
    this.address = address;
    this.car = car;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getSSN() {
    return this.SSN;
  }

  public String getAddress() {
    return this.address;
  }

  public Car getCar() throws CloneNotSupportedException {
    return (Car) this.car.clone();
  }

  @Override
  public String toString() {
    return "EmployeeModel [firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + SSN + ", address=" + address
        + ", car=" + car + "]";
  }
}
