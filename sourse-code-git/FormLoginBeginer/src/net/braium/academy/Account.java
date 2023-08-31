/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.braium.academy;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author nvhan
 */
public class Account implements Serializable{
  private String email;
  private String password;
  private String phoneNumber;
  
  public Account (){
  }

  public Account(String email, String password, String phoneNumber) {
    this.email = email;
    this.password = password;
    this.phoneNumber = phoneNumber;
  }

  
  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 41 * hash + Objects.hashCode(this.email);
    hash = 41 * hash + Objects.hashCode(this.password);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Account other = (Account) obj;
    if (!Objects.equals(this.email, other.email)) {
      return false;
    }
    return Objects.equals(this.password, other.password);
  }
  
  
}
