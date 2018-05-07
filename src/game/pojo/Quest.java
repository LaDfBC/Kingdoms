package game.pojo;

public class Quest {
    private String title;
    private String text;
    private Long id;
    //TODO: Make images
//    private QuestImage questImage;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quest quest = (Quest) o;
        return com.google.common.base.Objects.equal(title, quest.title) &&
                com.google.common.base.Objects.equal(text, quest.text) &&
                com.google.common.base.Objects.equal(id, quest.id);
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(title, text, id);
    }
}
