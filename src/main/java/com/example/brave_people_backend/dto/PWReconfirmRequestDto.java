package com.example.brave_people_backend.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PWReconfirmRequestDto {

    //request body에서 사용자가 입력한 현재 비밀번호를 받아옴
    String nowPassword;
}
