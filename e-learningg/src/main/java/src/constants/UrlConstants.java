package src.constants;

public class UrlConstants {

    private UrlConstants() {}

    //user url
    public static final String user_register = "api/v1/user/register";
    public static final String user_login = "api/v1/user/login";
    public static final String user_delete = "api/v1/user/{user_id}";
    public static final String user_update = "api/v1/user/{user_id}";
    public static final String user_detail = "api/v1/user/{user_id}";

    //admin url
    public static final String admin_register = "api/v1/admin/register";
    public static final String admin_login = "api/v1/admin/login";
    public static final String admin_delete = "api/v1/admin/{admin_id}";
    public static final String admin_update = "api/v1/admin/{admin_id}";
    public static final String admin_detail = "api/v1/admin/{admin_id}";

    //course url
    public static final String course_create = "api/v1/course/register";
    public static final String course_delete = "api/v1/course/{course_id}";
    public static final String course_update = "api/v1/course/{course_id}";
    public static final String course_search = "api/v1/course/{course_id}";
    public static final String course_detail = "api/v1/course/{course_id}";

    //teacher url
    public static final String teacher_create = "api/v1/teacher/create";
    public static final String teacher_delete = "api/v1/teacher/{teacher_id}";
    public static final String teacher_update = "api/v1/teacher/{teacher_id}";
    public static final String teacher_search = "api/v1/teacher/{teacher_id}";
    public static final String teacher_detail = "api/v1/teacher/{teacher_id}";
}
