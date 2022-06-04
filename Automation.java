package week3.Day2;

public class Automation extends MultiLanguage{
	public void Selenium() {
		System.out.println("Selenium method is from TestTool interface");
	}

	public void Java() {
		System.out.println("Selenium method is a Language interface");
	}

	@Override
	public void Python() {
		System.out.println("Selenium suports MultipleLanguage Abstract Class");	
	}
	public static void main(String arg[]) {
		Automation au = new Automation();
		au.Selenium();
		au.Java();
		au.Python();
		au.ruby();
	}
}
