package lykos.tools.effective.resource.manage.builder;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by yanfeng.lin.
 * Date : 16-10-22
 */
public class Room {
    private final String garden;
    private final Boolean garage;
    private final String direction;
    private final String location;

    public Room(RoomBuilder roomBuilder) {
        this.garden = roomBuilder.getGarden();
        this.garage = roomBuilder.getGarage();
        this.direction = roomBuilder.getDirection();
        this.location = roomBuilder.getDirection();
    }

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).toString();

    }
}
