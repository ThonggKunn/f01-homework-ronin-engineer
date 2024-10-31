package src.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import src.constants.UrlConstants;
import src.dto.LoginRequest.UserLoginRequest;
import src.dto.RegisterRequest.UserRegisterRequest;
import src.dto.UpdateRequest.UserUpdateRequest;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @PostMapping(UrlConstants.user_register)
    public ResponseEntity<?> registerUser(@RequestBody UserRegisterRequest request) {
        return ResponseEntity.ok(null);
    }

    @PostMapping(UrlConstants.user_login)
    public ResponseEntity<?> loginUser(@RequestBody UserLoginRequest request) {
        return ResponseEntity.ok(null);
    }

    @PutMapping(UrlConstants.user_update)
    public ResponseEntity<?> updateUser(@RequestBody UserUpdateRequest request, @PathVariable String user_id) {
        return ResponseEntity.ok(null);
    }
}
