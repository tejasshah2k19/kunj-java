package google;

public class Gmail {

	int a;
	protected int b;
	public int c;
	private int d;

	public void sendMail() {
		System.out.println("Mail Sent");
	}

	protected void authenticate() {
		System.out.println("authenticate");
	}

	void signin() {
		System.out.println("signin");
	}

	private void logout() {
		System.out.println("logout");
	}
}

//default 
class GoogleDrive {
	public static void main(String[] args) {
		Gmail g = new Gmail();
//		g.logout();
		g.signin();
		g.authenticate();
		g.sendMail();
	}
}
