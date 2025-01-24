package org.phone;

public class PhoneInfo {
	
			private void phoneName() {
				
			System.out.println("Phone Name : VIVO");
			}
			private void phoneMieiNum() {
				
				System.out.println("IMEI NO : 156985654684");
				}
				
			private void Camera() {
				
				System.out.println("Camera : 18Pixel");
				}
            private void storage() {
				
				System.out.println("Storage : 124 GB");
				}
            private void osName() {
	
	System.out.println("OS Name : Android");
	}
				public static void main(String[] args) {
					PhoneInfo pho=new PhoneInfo();
					pho.phoneName();
					pho.phoneMieiNum();
					pho.Camera();
					pho.storage();
					pho.osName();
		
				}

		}

