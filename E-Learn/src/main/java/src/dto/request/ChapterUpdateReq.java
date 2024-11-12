package src.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
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
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ChapterUpdateReq {

    @NotEmpty(message = "Chapter name is require")
    @Size(max = 50, message = "Chapter name must be less than 50 chars.")
    private String name;
    @Size(max = 100, message = "Description must be less than 100 chars.")
    private String description;
    @NotEmpty(message = "Status is require")
    private String status;
    @NotNull(message = "Order is require")
    @Min(value = 1, message = "Order must be higher than 0.")
    private String order;
}
