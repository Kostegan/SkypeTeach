package base.user.platform;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Platform implements IPlatform {
    private IFlyable flyableEntity;
    private List<IFlyable> list = new ArrayList<>();

    @Override
    public void setEntity(IFlyable entity) {
        flyableEntity = entity;
        list.add(entity);
    }

    @Override
    public void Start() {
        prepare();
        flyableEntity.launch();
    }

    @Override
    public void StartAllPilots() {
        prepare();
        for(int i = 0; i < list.size(); i++){
            list.get(i).launch();
        }
    }

    private void prepare() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Start...");

    }

}
