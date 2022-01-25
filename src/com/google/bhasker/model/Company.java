package com.google.bhasker.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Company implements Serializable {

  private String name;
  private List<Employee> listOfEmployee;
  private double marketCap;
  private int priceToEarning;
  private double debt;
  private String industry; // IT, Banking, Service, Menufacturing
  private String status;
  private String parentCompany;
  private String origin;
  private Date originDate;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Employee> getListOfEmployee() {
    return listOfEmployee;
  }

  public void setListOfEmployee(List<Employee> listOfEmployee) {
    this.listOfEmployee = listOfEmployee;
  }

  public double getMarketCap() {
    return marketCap;
  }

  public void setMarketCap(double marketCap) {
    this.marketCap = marketCap;
  }

  public int getPriceToEarning() {
    return priceToEarning;
  }

  public void setPriceToEarning(int priceToEarning) {
    this.priceToEarning = priceToEarning;
  }

  public double getDebt() {
    return debt;
  }

  public void setDebt(double debt) {
    this.debt = debt;
  }

  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getParentCompany() {
    return parentCompany;
  }

  public void setParentCompany(String parentCompany) {
    this.parentCompany = parentCompany;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public Date getOriginDate() {
    return originDate;
  }

  public void setOriginDate(Date originDate) {
    this.originDate = originDate;
  }


}
