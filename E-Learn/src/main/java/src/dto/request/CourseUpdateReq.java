package src.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CourseUpdateReq {

    @NotBlank(message = "Name can't' be blank")
    @Size(max = 100, message = "Name must be less than or equal to 100 chars")
    private String name;
    @Size(max = 1000, message = "Description must be less than 1000 chars")
    private String description;
    @NotBlank(message = "Status cannot be blank")
    @Size(max = 50, message = "Status must be less 50 chars")
    private String status;

    private String teacherID;
}
