import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class StreamCrypto {
    public byte[] encryptData(String data) throws Exception {
        // VULNERABILITY: RC4 is a broken stream cipher
        String keyString = "SECRET_KEY_12345";
        SecretKeySpec key = new SecretKeySpec(keyString.getBytes(), "RC4");
        
        Cipher cipher = Cipher.getInstance("RC4");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return cipher.doFinal(data.getBytes());
    }
}
