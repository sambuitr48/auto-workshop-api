/*/package co.sam.autoworkshop.autoworkshopapi.controller;

import co.sam.autoworkshop.autoworkshopapi.model.JwtResponse;
import co.sam.autoworkshop.autoworkshopapi.model.LoginRequest;
import co.sam.autoworkshop.autoworkshopapi.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
        // Ignoramos la autenticación real y devolvemos el token estático directamente
        String jwt = jwtService.generateStaticToken();
        return ResponseEntity.ok(new JwtResponse(jwt)); // Devolver el token
    }
}/*/

