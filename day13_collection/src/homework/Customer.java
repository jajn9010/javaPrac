package homework;

import java.util.Objects;
import java.util.Scanner;

public class Customer {  //Model
	String name, address, tel;
	
	public Customer(String name, String address, String tel) {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	

	@Override
	public int hashCode() {
		return this.name.hashCode() + this.address.hashCode() + this.tel.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Customer ) {
			Customer temp = (Customer)obj;
			
			return this.name.equals(temp.name) && this.address.equals(temp.address)
					&& this.tel.equals(temp.tel);
		}
		return false;
		
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", tel=" + tel + "]";
	}


	public Customer(String tel) {
		this.tel = tel;
	}
}
