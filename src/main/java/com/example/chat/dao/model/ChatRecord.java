package com.example.chat.dao.model;

import java.util.Date;

public class ChatRecord {
    /**
     * chat_record.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * chat_record.from_user_id
     *
     * @mbggenerated
     */
    private Integer fromUserId;

    /**
     * chat_record.to_user_id
     *
     * @mbggenerated
     */
    private Integer toUserId;

    /**
     * chat_record.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * chat_record.attachment
     *
     * @mbggenerated
     */
    private String attachment;

    /**
     * chat_record.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method returns the value of the database column chat_record.id
     *
     * @return the value of chat_record.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column chat_record.id
     *
     * @param id the value for chat_record.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column chat_record.from_user_id
     *
     * @return the value of chat_record.from_user_id
     *
     * @mbggenerated
     */
    public Integer getFromUserId() {
        return fromUserId;
    }

    /**
     * This method sets the value of the database column chat_record.from_user_id
     *
     * @param fromUserId the value for chat_record.from_user_id
     *
     * @mbggenerated
     */
    public void setFromUserId(Integer fromUserId) {
        this.fromUserId = fromUserId;
    }

    /**
     * This method returns the value of the database column chat_record.to_user_id
     *
     * @return the value of chat_record.to_user_id
     *
     * @mbggenerated
     */
    public Integer getToUserId() {
        return toUserId;
    }

    /**
     * This method sets the value of the database column chat_record.to_user_id
     *
     * @param toUserId the value for chat_record.to_user_id
     *
     * @mbggenerated
     */
    public void setToUserId(Integer toUserId) {
        this.toUserId = toUserId;
    }

    /**
     * This method returns the value of the database column chat_record.content
     *
     * @return the value of chat_record.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method sets the value of the database column chat_record.content
     *
     * @param content the value for chat_record.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method returns the value of the database column chat_record.attachment
     *
     * @return the value of chat_record.attachment
     *
     * @mbggenerated
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * This method sets the value of the database column chat_record.attachment
     *
     * @param attachment the value for chat_record.attachment
     *
     * @mbggenerated
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    /**
     * This method returns the value of the database column chat_record.create_time
     *
     * @return the value of chat_record.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method sets the value of the database column chat_record.create_time
     *
     * @param createTime the value for chat_record.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}