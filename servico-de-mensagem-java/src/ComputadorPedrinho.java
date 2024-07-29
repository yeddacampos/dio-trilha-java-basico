public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMessenger fbm = new FacebookMessenger();
		fbm.enviarMensagem();
		fbm.receberMensagem();
		
		TelegramMessenger tlg = new TelegramMessenger();
		tlg.enviarMensagem();
		tlg.receberMensagem();
		
	}
}