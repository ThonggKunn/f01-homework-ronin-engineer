package src.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import src.dto.Request.TeacherRequest;

@RestController
@RequestMapping("/api/admin/teachers")
public class AdminTeacherController {

    @PostMapping
    public ResponseEntity<?> createTeacher(@RequestBody TeacherRequest request) {
        return ResponseEntity.ok(null);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateTeacher(@PathVariable Long id, @RequestBody TeacherRequest request) {
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTeacher(@PathVariable Long id) {
        return ResponseEntity.ok(null);
    }

    @GetMapping
    public ResponseEntity<?> searchTeachers(
            @RequestParam(required = false) String username,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String status,
            @RequestParam(required = false) String createdFrom,
            @RequestParam(required = false) String createdTo
    ) {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTeacherDetails(@PathVariable Long id) {
        return ResponseEntity.ok(null);
    }
}

