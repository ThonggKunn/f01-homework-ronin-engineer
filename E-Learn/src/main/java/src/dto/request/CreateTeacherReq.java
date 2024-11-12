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
public class CreateTeacherReq {

    @NotBlank(message = "Name must not be blank")
    @Size(max = 50, message = "Name must not exceed 50 chars")
    private String name;
    @NotBlank(message = "Status must not be blank")
    @Size(max = 50, message = "Status must not higher than 50 chars")
    private String status;
    @Size(max = 50, message = "Username must not higher than 50 chars")
    private String username;
    @Size(min = 8, max = 16, message = "Password must be between 8 and 16 chars")
    private String password;
}
