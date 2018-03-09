package com.blog.domain;

public class UserRank {
    private Long id;

    private Long rankId;

    private Long rankMark;

    private String rankName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRankId() {
        return rankId;
    }

    public void setRankId(Long rankId) {
        this.rankId = rankId;
    }

    public Long getRankMark() {
        return rankMark;
    }

    public void setRankMark(Long rankMark) {
        this.rankMark = rankMark;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName == null ? null : rankName.trim();
    }
}