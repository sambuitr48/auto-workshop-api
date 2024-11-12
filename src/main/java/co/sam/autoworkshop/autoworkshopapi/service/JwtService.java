package co.sam.autoworkshop.autoworkshopapi.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JwtService {

    private final String SECRET_KEY = "mySecretKey"; // Cambia esto por algo más seguro en producción
    private final long EXPIRATION_TIME = 86400000; // 1 día en milisegundos

    public String generateStaticToken() {
        return Jwts.builder()
                .setSubject("user") // Puedes ajustar esto según tus necesidades
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }
}
