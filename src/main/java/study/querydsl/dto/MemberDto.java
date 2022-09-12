package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import org.springframework.web.bind.annotation.RestController;

@Data
public class MemberDto {
    private String username;
    private int age;

    public MemberDto() {}

    @QueryProjection
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
        System.out.println("username = "+ username);
        System.out.println("age = "+ age);
    }



}
