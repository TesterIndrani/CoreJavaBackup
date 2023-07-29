package abstractionProgram;

public class Whatsapp_Driver {
public static void main(String[] args) {

	Application app = new Application();
	app.sendMsg();
	app.audioCall();
	app.videoCall();
	
	System.out.println();

	Whatsapp w = new Application();
	w.sendMsg();
	w.audioCall();
	w.videoCall();
}
}
