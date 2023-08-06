package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class SecuritiesFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Securities();
    }
     
}
