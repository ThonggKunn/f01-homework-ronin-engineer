package src.constants;

public class UrlConstants {

    private UrlConstants() {}

    public static final String admin_login = "/api/v1/admin/login";

    //user
    public static final String user_register = "/api/v1/user/register";

    public static final String user_login = "/api/v1/user/login";

    public static final String user_delete = "/api/v1/user/{user_id}/delete";

    public static final String user_update = "/api/v1/user/{user_id}/update";

    public static final String user_info = "/api/v1/users/{user_id}";

    public static final String get_user = "/api/v1/users";


    public static final String user_rate_course = "/api/v1/user/{user_id}/course/{course_id}/rate";

    public static final String user_review_course = "/api/v1/user/{user_id}/course/{course_id}/review";

    public static final String user_view_course = "/api/v1/course/{course_id}";

    public static final String user_register_course = "/api/v1/users/{user_id}/course/{course_id}/register";

    public static final String user_show_registered_course = "/api/v1/user/{user_id}/course/registered";

    public static final String user_study = "/api/v1/user/{user_id}/course/{course_id}/study";

    //teacher
    public static final String create_teacher = "/api/v1/teacher/create";

    public static final String update_teacher = "/api/v1/teacher/{teacher_id}/update";

    public static final String get_teacher = "/api/v1/teacher";

    public static final String teacher_info = "/api/v1/teacher/{teacher_id}/inform";

    //course
    public static final String create_course = "/api/v1/course/create";

    public static final String update_course = "/api/v1/course/{course_id}/update";

    public static final String delete_course = "/api/v1/course/{course_id}/delete";

    public static final String get_course = "/api/v1/course";

    public static final String course_info = "/api/v1/course/{course_id}/inform";

    //chapter
    public static final String create_chapter = "/api/v1/{course_id}/chapter/create";

    public static final String update_chapter = "/api/v1/{course_id}/chapter/{chapter_id}/update";

    public static final String delete_chapter = "/api/v1/{course_id}/chapter/{chapter_id}/delete";

    public static final String get_chapter = "/api/v1/course/{course_id}/chapter";

    public static final String chapter_info = "/api/v1/chapter/{chapter_id}/inform";

    //lesson
    public static final String create_lesson = "/api/v1/{chapter_id}/lesson/create";

    public static final String update_lesson = "/api/v1/{chapter_id}/lesson/{lesson_id}/update";

    public static final String delete_lesson = "/api/v1/{chapter_id}/lesson/{lesson_id}/delete";

    public static final String get_lesson = "/api/v1/course/{course_id}/chapter/{chapter_id}/lesson";

    public static final String lesson_info = "/api/v1/lesson/{lesson_id}/inform";


    //entity

    public static final String user_course_info = "/api/v1/user/{user_id}/course/{course_id}/inform";

    public static final String user_course_lesson_info = "/api/v1/user/{user_id}/course/{course_id}/lesson/{lesson_id}/inform";

}