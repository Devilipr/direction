package com.thinkgem.jeesite.common.utils;


import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

/**
 * Created by 通子 on 2017/9/5.
 * AES加密
 */

public class AESCrypt {

    public static final String SDFIASK_AKS = "bigdata_TEST1";

    private final Cipher cipher;

    private final SecretKeySpec key;

    private AlgorithmParameterSpec spec;

    public static final String SEED_16_CHARACTER = SDFIASK_AKS;

    public AESCrypt() throws Exception {

        // hash password with SHA-256 and crop the output to 128-bit for key

        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        digest.update(SEED_16_CHARACTER.getBytes("UTF-8"));

        byte[] keyBytes = new byte[32];

        System.arraycopy(digest.digest(), 0, keyBytes, 0, keyBytes.length);

        cipher = Cipher.getInstance("AES/CBC/NoPadding");

        key = new SecretKeySpec(keyBytes, "AES");

        spec = getIV();

    }

    public AlgorithmParameterSpec getIV() {

        byte[] iv = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};

        IvParameterSpec ivParameterSpec;

        ivParameterSpec = new IvParameterSpec(iv);

        return ivParameterSpec;

    }

    public String encrypt(String plainText) throws Exception {

        cipher.init(Cipher.ENCRYPT_MODE, key, spec);

        byte[] encrypted = cipher.doFinal(plainText.getBytes("UTF-8"));

        String encryptedText = new String(Base64.encodeBase64(encrypted), "UTF-8");

        return encryptedText;

    }

    public String decrypt(String cryptedText) throws Exception {

        cipher.init(Cipher.DECRYPT_MODE, key, spec);

        byte[] bytes = Base64.decodeBase64(cryptedText);

        byte[] decrypted = cipher.doFinal(bytes);

        String decryptedText = new String(decrypted, "UTF-8");

        return decryptedText;

    }
	public static void main(String[] args) throws Exception {
		AESCrypt a= new AESCrypt();
		 String d=a.decrypt("h8fUcVl3mhIoa2oTIdn0JuvRDPWycMAewgNMmbZy+bB5Lzr0I6vGr2JRwYrLC7V17Jqim/6cdH/r59s0aH0MYQeQjRnuy20A0T8My2wDOeoNAiEeQvK1T3dOO9rxyEFHYZuT4kKT1aSu6QC9G40DRMOlEAMNWgiFwxLzh/6x6icapYmfR0t3t8Hs+jnHKRTAiGkpnc9FWnLSR/IQKRHYrYp5STErGLLZOIcJGy9ZPMJWrMyIyJzBetqA5oLMIxu3QrvHE+3Km2+0kliZkEhR+mlChrWk9V8k6oayVNSlXBBtcgX/f4G0uNadrCmBNZquAtSutYOkYW23ooyDWKGC6g==");
		 System.out.println(d);
	}
}
