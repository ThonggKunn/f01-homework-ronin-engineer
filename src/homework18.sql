#tìm số môn học mà gvien duoc phan cong
select teacher.id, teacher.name, count(course.id) as course_count
from teacher join course on teacher.id = course.teacher_id
group by teacher.id, teacher.name;
#tìm số môn học mà gvien được phân công (tính từ trang thứ 2)
select teacher.id, teacher.name, count(course.id) as course_count
from teacher left join course on teacher.id = course.teacher_id
group by teacher.id order by teacher.id
    limit 2 offset 2;
#tìm danh sách sinh viên và khóa học đã đăng ký
select student.id, student.name, course.name from student
                                                      join student_course on student.id = student_course.student_id
                                                      join course on student_course.course_id = course.id
order by student.id;
#lấy xếp hạng trung bình của mỗi khóa học có xh trung bình trên 4
select course.id, course.name, avg(student_course.rating) as avg_score
from course join student_course on course.id = student_course.course_id
group by course.id, course.name
having avg_score > 4;
# lấy danh sách sinh viên, các khóa học họ đã đăng ký và tên của giáo viên khóa học đó
select student.id, student.name, course.name, teacher.name from student
                                                                    join student_course on student.id = student_course.student_id
                                                                    join course on student_course.course_id = course.id
                                                                    join teacher on course.teacher_id = teacher.id
order by student.id;
#lấy danh sách tất cả sinh viên, các khóa học đã đăng ký, danh sách các chapter và trạng thái từng sinh viên
select course.id, course.name, chapter.id, chapter.name, lesson.id, lesson.name,user_course_user_id, chapter.status, student.name as name
from course join chapter on course.id = chapter.course_id
            join lesson on chapter.id = lesson.chapter_id
            join student_course_lesson on lesson.id = student_course_lesson.lesson_id
            join student_course on course.id = student_course.course_id
            join student on student_course.student_id = student.id
order by course.id DESC;

#hiển thị thông tin về khóa học và chapter, thông tin bài học và số lượng user đã hoòa thành, chưa hoàn thành
select course.id, course.name, chapter.id, chapter.name, lesson.id, lesson.name, count(student.status) = 'active' as completed_user, count(student.status) = 'inactive' as in_progress_user
from course
         join chapter on course.id = chapter.course_id
         join lesson on chapter.id = lesson.chapter_id
         join student_course on course.id = student_course.course_id
         join student on student_course.student_id = student.id
         join student_course_lesson on student.id = student_course_lesson.lesson_id
group by course.id, course.name, chapter.id, chapter.name, lesson.id, lesson.name;