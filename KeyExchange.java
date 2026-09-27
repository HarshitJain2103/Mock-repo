
import javax.crypto.KeyAgreement;

public class KeyExchange {
    public void doExchange() {
        // ECDH is not quantum-safe
        KeyAgreement ka = KeyAgreement.getInstance("ECDH");
    }
}
