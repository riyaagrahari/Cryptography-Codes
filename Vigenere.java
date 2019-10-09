import java.util.Scanner;

public class Vigenere {
	public static void main(String[] args) {

		
		Scanner ob = new Scanner(System.in);

		//	Allow the user to choose if they want to encrypt or decrypt a message
		System.out.println("\tVigenhere Cipher\n Press 1 to encrypt a message\n Press 2 to decrypt a message\n******************************");
		int sc = ob.nextInt();
		ob.nextLine();

		if (sc == 1) {
			
			System.out.print("Enter the message to be encrypted\n");
			String message = ob.nextLine();
			message = message.toUpperCase();
			String words[] = message.split(" ");
			System.out.print("Enter the key\n");
			String k = ob.nextLine();
			k = k.toUpperCase();
			int key_length = k.length();
			String key="";
			System.out.println("The encrypted message"); 
			for(int i=0;i<words.length;i++)
			{
				int l = words[i].length();
				if(l > key_length)
				{
					key=k;
					int k_len = key_length;
					while(k_len > l)
					{
						key = key+k;
						k_len = key.length();
					}
				}
			String encryptMessage = encryptMsg(words[i], key);
			System.out.print(encryptMessage+" ");
			}
		}
		else if (sc == 2) {
			
			System.out.print("Enter the message to be decrypted\n");
			String message = ob.nextLine();
			String words[] = message.split(" ");
			System.out.print("Enter the key\n");
			String k = ob.nextLine();
			k = k.toUpperCase();
			int key_length = k.length();
			String key="";
			System.out.println("The decrypted message"); 
			for(int i=0;i<words.length;i++)
			{
				int l = words[i].length();
				if(l > key_length)
				{
					key=k;
					int k_len = key_length;
					while(k_len > l)
					{
						key = key+k;
						k_len = key.length();
					}
				}
				String decryptMessage = decryptMsg(words[i], key);
				
				System.out.print(decryptMessage+" ");
			}
		}
		else 
		{
			System.out.println("Invalid Choice!");
		}
		ob.close();
	}

	public static String encryptMsg(String m, String k) {
		String message = "";
		m = m.toUpperCase();
		for (int i = 0, j = 0; i < m.length(); i++) {
			char ch = m.charAt(i);
			message += (char)(((ch - 65) + (k.charAt(j)-65)) % 26 + 65);
			j = ++j % k.length();
		}
		return message;
	}

	public static String decryptMsg(String m, String k) {
		String message = "";
		m = m.toUpperCase();
		for (int i = 0, j = 0; i < m.length(); i++) {
			char ch = m.charAt(i);
			message += (char)((ch - k.charAt(j) + 26) % 26 + 65);
			j = ++j % k.length();
		}
		return message;
	}
}