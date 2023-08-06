package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class PlatinumFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Platinum();
    }
    
}
