package computer1;

public class Desktop implements Hardware,Software{
	public void desktopModel() {
		System.out.println("desktop");
	}

	@Override
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("softwareResources ");
	}

	@Override
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("hardwareResources ");

	}
	
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.desktopModel();
		desktop.softwareResources();
		desktop.hardwareResources();
	}
}
