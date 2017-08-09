package org.zendesk.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * @author robert-fernandes
 */
@JsonIgnoreProperties(value = "comment", ignoreUnknown = true)
public class TicketImport extends Ticket {

    private static final long serialVersionUID = 1L;

    private List<Comment> comments;

    public TicketImport() {
    }

    public TicketImport(Requester requester, String subject, List<Comment> comments) {
        super(requester, subject, null);
        this.comments = comments;
    }

    public TicketImport(long requesterId, String subject, List<Comment> comments) {
        super(requesterId, subject, null);
        this.comments = comments;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public Comment getComment() {
        return null;
    }

    @Override
    public void setComment(Comment comment) {
        throw new UnsupportedOperationException("single comment is not supported for ticket import, include in comments list instead");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Ticket");
        sb.append("{assigneeId=").append(getAssigneeId());
        sb.append(", id=").append(getId());
        sb.append(", url='").append(getUrl()).append('\'');
        sb.append(", externalId='").append(getExternalId()).append('\'');
        sb.append(", type='").append(getType()).append('\'');
        sb.append(", subject='").append(getSubject()).append('\'');
        sb.append(", description='").append(getDescription()).append('\'');
        sb.append(", priority='").append(getPriority()).append('\'');
        sb.append(", status='").append(getStatus()).append('\'');
        sb.append(", recipient='").append(getRecipient()).append('\'');
        sb.append(", requesterId=").append(getRequesterId());
        sb.append(", submitterId=").append(getSubmitterId());
        sb.append(", organizationId=").append(getOrganizationId());
        sb.append(", groupId=").append(getGroupId());
        sb.append(", collaboratorIds=").append(getCollaboratorIds());
        sb.append(", forumTopicId=").append(getForumTopicId());
        sb.append(", problemId=").append(getProblemId());
        sb.append(", hasIncidents=").append(isHasIncidents());
        sb.append(", dueAt=").append(getDueAt());
        sb.append(", tags=").append(getTags());
        sb.append(", via=").append(getVia());
        sb.append(", customFields=").append(getCustomFields());
        sb.append(", satisfactionRating=").append(getSatisfactionRating());
        sb.append(", sharingAgreementIds=").append(getSharingAgreementIds());
        sb.append(", followupIds=").append(getFollowupIds());
        sb.append(", ticketFormId=").append(getTicketFormId());
        sb.append(", brandId=").append(getBrandId());
        sb.append(", createdAt=").append(getCreatedAt());
        sb.append(", updatedAt=").append(getUpdatedAt());
        sb.append(", comments=").append(comments);
        sb.append('}');
        return sb.toString();
    }
}
