package lykos.tools.effective.resource.manage.builder;

/**
 * Created by yanfeng.lin.
 * Date : 16-10-22
 */
public class TestBuilder {

    public static void main(String[] args) {
        RoomBuilder roomBuilder = new RoomBuilder();
        Room build = roomBuilder.setDirection("west").setGarage(true).setLocation("beijin").setGarden("large").build();
        System.out.println(build);
    }
}
