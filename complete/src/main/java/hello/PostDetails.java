package hello;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "PostDetails")
@Table(name = "post_details")
public class PostDetails {

    @Id
    private Long id;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "created_by")
    private String createdBy;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Post post;

    public PostDetails() {}

    public PostDetails(String createdBy) {
        createdOn = new Date();
        this.createdBy = createdBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}