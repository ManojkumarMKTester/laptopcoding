package org.lang;

public class StateDetails {
	private  void southindia(){
		
		System.out.println(" Karnataka, Kerala, Tamil Nadu");
		}
		private  void northindia() {
			// TODO Auto-generated method stub
           System.out.println("Jammu & Kashmir, Himachal Pradesh, Punjab,");
		}
			
public static void main(String[] args) {
	StateDetails stn=new StateDetails();
	stn.southindia();
	stn.northindia();
	
	LanguageInfo lng=new LanguageInfo();
	lng.tamilLanguage();
	lng.englishLanguage();
	lng.hindiLanguage();
	
}
}