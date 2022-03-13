package com.yama.springboot.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.Data;

@Data
public class Comment {
    private String commentId;
    private String userId;
    private String content;
    private LocalDateTime postDateTime;
    private List<String> mentionId;

    public Comment(String userId, String content, List<String> mentionIdList) throws Exception{
        if(Objects.isNull(userId)){
            throw new Exception();
        }
        this.commentId = "1";
        this.userId = userId;
        this.content = content;
        this.postDateTime = LocalDateTime.now();
        this.mentionId = new ArrayList<String>(mentionIdList);
    }

}
