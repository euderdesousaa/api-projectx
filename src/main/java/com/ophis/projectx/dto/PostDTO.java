package com.ophis.projectx.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ophis.projectx.entities.Comments;
import com.ophis.projectx.entities.Post;
import com.ophis.projectx.entities.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String body;

    private UserDTO user;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    private String imgPost;

    public PostDTO(Post entity){
        id = entity.getId();
        body = entity.getBody();
        createdAt = entity.getCreatedAt();
        imgPost = entity.getImgPost();
    }
}
