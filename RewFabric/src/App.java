import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import Classes.ItemGenerator;
import Classes.Rewards.BronzeFabric;
import Classes.Rewards.GemFabric;import Classes.Rewards.GoldFabric;
import Classes.Rewards.PlatinumFabric;
import Classes.Rewards.SapphireFabric;
import Classes.Rewards.SecuritiesFabric;
import Classes.Rewards.SilverFabric;

public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator GoldFabric = new GoldFabric();
        ItemGenerator GemFabric = new GemFabric();
        ItemGenerator SilverFabric = new SilverFabric();
        ItemGenerator BronzeFabric = new BronzeFabric();
        ItemGenerator SecuritiesFabric = new SecuritiesFabric();
        ItemGenerator PlatinumFabric = new PlatinumFabric();
        ItemGenerator SapphireFabric = new SapphireFabric();

        List<ItemGenerator> fabricList = new ArrayList<>(
            Arrays.asList(GoldFabric,GemFabric,SilverFabric,
            BronzeFabric, SecuritiesFabric, PlatinumFabric, SapphireFabric )
        );
    

        for(int i=0;i<20;i++)
        {
            int index = (int) (Math.random() * fabricList.size());
            fabricList.get(index).openReward();
        }
    }
}
