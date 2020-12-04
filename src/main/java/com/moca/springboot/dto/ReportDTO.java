package com.moca.springboot.dto;

import lombok.Data;

public class ReportDTO {

    @Data
    public static class ReportRequest {
        // 나의 userId
        private Long userId;
        // 신고하는 계정의 userId (계정신고가 아니면 null)
        private Long reportedUserId;
        // 신고하는 고민글의 postId (고민글신고가 아니면 null)
        private Long postId;
        // 신고하는 후기글의 postId (후기글신고가 아니면 null)
        private Long reviewId;
        // 신고하는 댓글의 commentId (댓글 신고가 아니면 null)
        private Long commentId;
        // 신고사유: 비방, 욕설, 광고, ...(어느 종류의 신고든 항상 들어가야함)
        private String reportReason;
    }
}