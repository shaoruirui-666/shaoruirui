package org.example.usermassage;
import java.time.LocalDateTime;
import java.time.LocalDate;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String password;
    private Integer id;
    private Integer age;
    private LocalDate updatetime;

}
