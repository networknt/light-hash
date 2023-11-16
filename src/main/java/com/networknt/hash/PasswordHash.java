package com.networknt.hash;

import com.networknt.utility.HashUtil;
import static java.lang.System.exit;

/**
 * This is a hash utility to hash the secret with stronger implementation.
 */
public class PasswordHash {
    public static void main(String [] args) {
        if(args.length < 1) {
            System.out.println("Please provide a key or password in plain text to hash!");
            System.out.println("java -jar hash.jar password");
            exit(0);
        }
        try {
            System.out.println(HashUtil.generateStrongPasswordHash(args[0]));
        } catch (Exception e) {
            throw new RuntimeException("Unable to hash", e);
        }
    }
}
