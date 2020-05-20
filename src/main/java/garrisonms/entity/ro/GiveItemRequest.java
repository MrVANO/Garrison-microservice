package garrisonms.entity.ro;

public class GiveItemRequest {
    private Long itemId;
    private Long wariorId;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getWariorId() {
        return wariorId;
    }

    public void setWariorId(Long wariorId) {
        this.wariorId = wariorId;
    }
}