package com.jpa.spingboot.config.auth.dto;

import com.jpa.spingboot.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

/**
 * 인증된 사용자 정보 저장용
 * User 클래스는 Entity이므로 직렬화 기능을 갖는 SesstionUser 클래스 따로 관리
 */
@Getter
public class SessionUser implements Serializable {

    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture =user.getPicture();
    }
}
