package org.phone;

public class InternalStorage {
private void processorName() {
System.out.println("processor");
}
private void ramSize() {
	System.out.println("ram");
}
public static void main(String[] args) {
	//create an object for internalstorage and external storage in
	//internal storage class to call the both class methods
	InternalStorage internal = new InternalStorage();
	internal.processorName();
	internal.ramSize();
	ExternalStorage external = new ExternalStorage();
	external.size();
	
}
}
