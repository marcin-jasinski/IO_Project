package pl.edu.pwr.io.lab.film;

public class FilmItem {

    public enum ItemStatus{
        RENTED, AVAILABLE, RESERVED, DAMAGED;
    }

    public enum Media{
        VHS, DVD, BLURAY;
    }

    private int itemNumer;
    private ItemStatus itemStatus;
    private Media media;

    public FilmItem(int itemNumer, ItemStatus itemStatus, Media media) {
        this.itemNumer = itemNumer;
        this.itemStatus = itemStatus;
        this.media = media;
    }

    public int getItemNumer() {
        return itemNumer;
    }

    public void setItemNumer(int itemNumer) {
        this.itemNumer = itemNumer;
    }

    public ItemStatus getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(ItemStatus itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }
}
