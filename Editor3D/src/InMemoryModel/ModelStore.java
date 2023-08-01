package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelEliments.Camera;
import ModelEliments.Flash;
import ModelEliments.PoligonalModel;
import ModelEliments.Scene;

public class ModelStore implements IModelChanger {
      public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver [] ChangeObservers;
    public ModelStore(IModelChangedObserver[] changeObservers) throws Exception {
        ChangeObservers = changeObservers;
        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();

        models.add(new PoligonalModel(null));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0,models,flashes, cameras));  

    }
    @Override
    public void NotifyChange(IModelChanger sender) {
        // 
    }
      public Scene GetScen(int id){
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id == id) {
                return scenes.get(i);
            }

        }
        return null;
      }
}
