package src.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import src.constants.UrlConstants;
import src.dto.LoginRequest.UserLoginRequest;

@RestController
public class Admin_UserController {

    @PostMapping(UrlConstants.admin_login)
    public ResponseEntity<?> loginUser(@RequestBody UserLoginRequest request) {
        return ResponseEntity.ok(null);
    }

    @DeleteMapping(UrlConstants.admin_delete)
    public ResponseEntity<?> deleteUser(@PathVariable Long admin_id) {
        return ResponseEntity.ok(null);
    }

    @GetMapping
    public ResponseEntity<?> searchUsers(
            @RequestParam(required = false) String username,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String status,
            @RequestParam(required = false) String createdFrom,
            @RequestParam(required = false) String createdTo
    ) {
        return ResponseEntity.ok(null);
    }

    @GetMapping(UrlConstants.admin_detail)
    public ResponseEntity<?> getUserDetails(@PathVariable Long admin_id) {
        return ResponseEntity.ok(null);

        
    }
}
