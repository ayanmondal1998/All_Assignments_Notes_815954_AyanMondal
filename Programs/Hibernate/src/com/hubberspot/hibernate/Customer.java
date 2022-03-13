package com.hubberspot.hibernate;


public class Customer {

 private Integer customerId;
 private String customerName;
 private String customerEmail;
 private String customerPhone;

 public Customer() {

 }


 public Integer getCustomerId() {
  return customerId;
 }


 public void setCustomerId(Integer customerId) {
  this.customerId = customerId;
 }


 public String getCustomerName() {
  return customerName;
 }


 public void setCustomerName(String customerName) {
  this.customerName = customerName;
 }


 public String getCustomerEmail() {
  return customerEmail;
 }


 public void setCustomerEmail(String customerEmail) {
  this.customerEmail = customerEmail;
 }


 public String getCustomerPhone() {
  return customerPhone;
 }


 public void setCustomerPhone(String customerPhone) {
  this.customerPhone = customerPhone;
 }



}
