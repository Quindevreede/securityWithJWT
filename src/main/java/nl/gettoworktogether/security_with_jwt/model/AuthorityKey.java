package nl.gettoworktogether.security_with_jwt.model;

import java.io.Serializable;

public class AuthorityKey implements Serializable {
    private String username;
    private String authority;
}