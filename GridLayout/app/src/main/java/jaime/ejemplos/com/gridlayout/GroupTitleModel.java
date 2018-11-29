package jaime.ejemplos.com.gridlayout;

public class GroupTitleModel implements ItemInterface {
    public String title;

    public GroupTitleModel(String title) {
        this.title = title;
    }

    @Override
    public boolean isSection() {
        return true;
    }
}