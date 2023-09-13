package org.company;

import org.client.Client;

public class Company extends Client{
 private void companyName() {
	 System.out.println("Company Name");
 }
 
 public static void main(String[] args) {
	Company company = new Company();
	company.companyName();
	company.clientName();
}
}
