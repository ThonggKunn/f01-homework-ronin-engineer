package src.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import src.constants.UrlConstants;
import src.dto.Request.CourseRequest;

@RestController
@RequestMapping("/api/admin/courses")
public class AdminCourseController {

    @PostMapping(UrlConstants.course_create)
    public ResponseEntity<?> createCourse(@RequestBody CourseRequest request) {
        return ResponseEntity.ok(null);
    }

    @PutMapping(UrlConstants.course_update)
    public ResponseEntity<?> updateCourse(@PathVariable Long course_id, @RequestBody CourseRequest request) {
        return ResponseEntity.ok(null);
    }

    @DeleteMapping(UrlConstants.course_delete)
    public ResponseEntity<?> deleteCourse(@PathVariable Long course_id) {
        return ResponseEntity.ok(null);
    }

    @GetMapping(UrlConstants.course_search)
    public ResponseEntity<?> searchCourses(@PathVariable String course_id) {
        return ResponseEntity.ok(null);
    }

    @GetMapping(UrlConstants.course_detail)
    public ResponseEntity<?> getCourseDetails(@PathVariable Long course_id) {
        return ResponseEntity.ok(null);
    }
}

