package ru.netology.domain.attachment;

public class Poll {
    private int id;
    private int ownerId;
    private int created;
    private String question;
    private String votes;
    private boolean anonymous;
    private boolean multiple;
    private int answerIds;
    private int endDate;
    private boolean closed;
    private boolean isBoard;
    private boolean canEdit;
    private boolean canVote;
    private boolean canReport;
    private boolean canShare;
    private int authorId;

    public String generateBlock(){
        return null;
    }
}
