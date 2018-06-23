package com.fallwater.testSpringMvc.entity;

public class Question {
    private Integer questionId;

    private String questionTitle;

    private String topicKvList;

    private Integer followedCount;

    private Integer scanedCount;

    private Long createTime;

    private Integer userId;

    private String questionContent;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getTopicKvList() {
        return topicKvList;
    }

    public void setTopicKvList(String topicKvList) {
        this.topicKvList = topicKvList;
    }

    public Integer getFollowedCount() {
        return followedCount;
    }

    public void setFollowedCount(Integer followedCount) {
        this.followedCount = followedCount;
    }

    public Integer getScanedCount() {
        return scanedCount;
    }

    public void setScanedCount(Integer scanedCount) {
        this.scanedCount = scanedCount;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}