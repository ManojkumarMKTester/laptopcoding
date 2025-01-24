package org.phone;

public class InternalStorage {
		public void processorName() {
	System.out.println(" Dragon");
		}
		public void ramSize() {
			System.out.println(" 4GB");
				}
		public static void main(String[] args) {
			InternalStorage il=new InternalStorage();
			il.ramSize();
			il.processorName();
			
			ExternalStorage el=new ExternalStorage();
			el.size();
		}

}
