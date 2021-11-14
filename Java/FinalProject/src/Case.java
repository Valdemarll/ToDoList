public class Case {
    private String caption;
    private String description;
    private String importance;
    private boolean completed;

    public Case(String caption, String description, String importance, boolean completed){
        this.caption = caption;
        this.description = description;
        this.importance = importance;
        this.completed = completed;
    }

    public String getCaption() {
        return caption;
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getImportance() {
        return importance;
    }
    public void setImportance(String importance) {
        this.importance = importance;
    }

    public boolean getCompleted() {
        return this.completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


    public String toString(){
        return "\nДело '" + caption + "'"+
                "\nОписание дела:\n" + description +
                "\nВажность дела:" + importance +
                "\nВыполнено: " + completed + "\n";
    }

}
