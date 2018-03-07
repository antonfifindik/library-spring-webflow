package entities;

/**
 * Created by Антон on 08.03.2018.
 */
public class VoteEntity {
    private long id;
    private int value;
    private long bookId;
    private String username;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VoteEntity that = (VoteEntity) o;

        if (id != that.id) return false;
        if (value != that.value) return false;
        if (bookId != that.bookId) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + value;
        result = 31 * result + (int) (bookId ^ (bookId >>> 32));
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }
}
