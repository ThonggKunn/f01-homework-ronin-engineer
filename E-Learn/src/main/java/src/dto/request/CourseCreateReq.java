package src.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
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
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CourseCreateReq {

    @NotBlank(message = "Name can't be blank")
    @Size(max = 100, message = "Name must be less than or equal to 100 chars")
    private String name;
    @Size(max = 1000, message = "Description must be less than 1000 chars")
    private String description;
    @NotBlank(message = "Status can't be blank")
    @Size(max = 50, message = "Status must be less than 50 chars")
    private String status;
    private String teacherID;
}
