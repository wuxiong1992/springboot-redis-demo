package com.redis.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CategoryRecord implements Serializable {

  /**
   * @Fields id : 对象ID
   */
  private String id;

  /**
   * @Fields objectType : 对象类型
   */
  private Integer objectType;

  /**
   * 部门
   */
  private String department;

  private String groups;

  private String partyId;

  /**
   * @Fields title : 标题
   */
  private String title;

  /**
   * @Fields titleImage : 标题图片
   */
  private List<String> titleImage = new ArrayList<String>();

  /**
   * @Fields digest : 摘要
   */
  private String digest;

  /**
   * @Fields type : 资讯活动类型
   */
  private String type;

  /**
   * @Fields isAtlas : 是否为图集
   */
  private Boolean isAtlas;

  /**
   * @Fields isShare : 是否可分享
   */
  private Boolean isShare;

  /**
   * @Fields isComment : 是否可评论
   */
  private Boolean isComment;

  /**
   * @Fields layout : 布局形式（1：左右；2：上下；3：三张标题图片一次排开）
   */
  private Integer layout;

  /**
   * @Fields pviews : 浏览次数
   */
  private Integer pviews;

  /**
   * @Fields commentCount : 评论数
   */
  private Integer commentCount;

  /**
   * @Fields participant : 活动参与人数
   */
  private Integer participant;

  /**
   * @Fields endTime : 活动结束时间
   */
  private String endTime;

  /**
   * @Fields address : 活动地址
   */
  private String address;

  /**
   * @Fields isLive : 是否为直播
   */
  private Boolean isLive;

  /**
   * @Fields orgId : 所属部门
   */
  private String orgId;

  /**
   *
   */
  private String orgType;

  private String show_index;

  /**
   * @Fields createDate : 创建时间
   */
  private String createDate;

  /**
   * @Fields updateDate : 更新时间
   */
  private Date updateDate;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getObjectType() {
    return objectType;
  }

  public void setObjectType(Integer objectType) {
    this.objectType = objectType;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getGroups() {
    return groups;
  }

  public void setGroups(String groups) {
    this.groups = groups;
  }

  public String getPartyId() {
    return partyId;
  }

  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<String> getTitleImage() {
    return titleImage;
  }

  public void setTitleImage(List<String> titleImage) {
    this.titleImage = titleImage;
  }

  public String getDigest() {
    return digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Boolean getAtlas() {
    return isAtlas;
  }

  public void setAtlas(Boolean atlas) {
    isAtlas = atlas;
  }

  public Boolean getShare() {
    return isShare;
  }

  public void setShare(Boolean share) {
    isShare = share;
  }

  public Boolean getComment() {
    return isComment;
  }

  public void setComment(Boolean comment) {
    isComment = comment;
  }

  public Integer getLayout() {
    return layout;
  }

  public void setLayout(Integer layout) {
    this.layout = layout;
  }

  public Integer getPviews() {
    return pviews;
  }

  public void setPviews(Integer pviews) {
    this.pviews = pviews;
  }

  public Integer getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(Integer commentCount) {
    this.commentCount = commentCount;
  }

  public Integer getParticipant() {
    return participant;
  }

  public void setParticipant(Integer participant) {
    this.participant = participant;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Boolean getLive() {
    return isLive;
  }

  public void setLive(Boolean live) {
    isLive = live;
  }

  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public String getOrgType() {
    return orgType;
  }

  public void setOrgType(String orgType) {
    this.orgType = orgType;
  }

  public String getShow_index() {
    return show_index;
  }

  public void setShow_index(String show_index) {
    this.show_index = show_index;
  }

  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }
}
