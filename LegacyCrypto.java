import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class LegacyCrypto {
    public byte[] encrypt(String message) throws Exception {
        // WEAK CIPHER: Blowfish
        String keyString = "HARDCODED_KEY";
        SecretKeySpec key = new SecretKeySpec(keyString.getBytes(), "Blowfish");
        
        Cipher cipher = Cipher.getInstance("Blowfish/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return cipher.doFinal(message.getBytes());
    }
}
