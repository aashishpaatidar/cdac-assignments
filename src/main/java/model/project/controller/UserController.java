package model.project.controller;

import model.project.entity.User;
import model.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public String homePage() {
        return "<h3> Welcome welcome..huh!</h3>";
    }

    @GetMapping("/users")
    public ResponseEntity<?> fetchUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity<?> findUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.getUser(user.getEmail(), user.getPassword()),
                HttpStatus.OK);
    }

    @GetMapping("/admin")
    public String loadAdminUser() {
        return "<h3> Welcome admin!</h3>";
    }
}
