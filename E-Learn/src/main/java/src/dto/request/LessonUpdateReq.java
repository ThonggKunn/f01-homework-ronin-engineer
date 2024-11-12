package src.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
public class LessonUpdateReq {

    @NotBlank(message = "Name is require")
    @Size(max = 255, message = "Name must not exceed 255 chars")
    private String name;
    @Size(max = 1000, message = "Description must not exceed 1000 chars")
    private String description;
    @NotBlank(message = "Status is required.")
    @Size(max = 50, message = "Status must not exceed 50 chars")
    private String status;
    @NotBlank(message = "Type is required.")
    @Size(max = 50, message = "Type must not exceed 50 chars")
    private String type;
    @Size(max = 50, message = "URL must not exceed 50 chars")
    private String url;
    @NotNull(message = "Order is required.")
    @Min(value = 1, message = "Order must be higher than 0")
    private Integer order;

    private Long chapterId;
}
