package com.google.bhasker.model;

import java.io.Serializable;
import java.util.List;

public class Manager extends Employee implements Serializable {

  private int parkingSpot;
  private List<Employee> underEmployee;

  public Manager() {

  }
  public Manager(String name) {

  }
  private int giveRaiseTo(Employee employee) {
    return 0;
  }

}
