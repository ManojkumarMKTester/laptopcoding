//Abstraction & multiple inheritance
public class Desktop implements Software,HardWare {
	private void desktopModel() {
System.out.println("Desktop Model HP12G");
	}

	@Override
	public void softwareResources() {
System.out.println("Software Windows");		
	}

	@Override
	public void hardwareResources() {
System.out.println("Hardware intel");		
	}
	
	public static void main(String[] args) {
		Desktop sy=new Desktop();
		sy.desktopModel();
		sy.softwareResources();
		sy.hardwareResources();
		
	System.out.println("------------");
	
	
	
	
	}
}
