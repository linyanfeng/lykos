package lykos.tools.effective.resource.manage.builder;

/**
 * Created by yanfeng.lin.
 * Date : 16-10-22
 */
public class RoomBuilder implements Builder<Room> {
    private String garden;
    private Boolean garage;
    private String direction;
    private String location;

    public String getGarden() {
        return garden;
    }

    public RoomBuilder setGarden(String garden) {
        this.garden = garden;
        return this;
    }

    public Boolean getGarage() {
        return garage;
    }

    public RoomBuilder setGarage(Boolean garage) {
        this.garage = garage;
        return this;

    }

    public String getDirection() {
        return direction;
    }

    public RoomBuilder setDirection(String direction) {
        this.direction = direction;
        return this;

    }

    public String getLocation() {
        return location;
    }

    public RoomBuilder setLocation(String location) {
        this.location = location;
        return this;

    }

    @Override
    public Room build() {
        return new Room(this);
    }
}
