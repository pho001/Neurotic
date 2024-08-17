import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Layers {
    List<Layer> layers;
    public Layers (){
        layers=new ArrayList<>();
    }

    public Layers add(Layer layer){
        layers.add(layer);
        return this;
    }

    public Layers addLinear(int features_in, int features_out, boolean useBias,Initializer init){
        layers.add(LayerFactory.LinearLayer(features_in,features_out,useBias,init));
        return this;
    }

    public Layers addActivation(Activation activation){
        layers.add(LayerFactory.ActivationLayer(activation));
        return this;
    }

    public Layers addFlatten(int factor){
        layers.add(LayerFactory.FlattenLayer(factor));
        return this;
    }

    public Layers addOneDirectionalRNN(int inputSize, int hiddenSize, boolean useBias,Initializer init){
        layers.add(LayerFactory.OneDirectionalRNN(inputSize,hiddenSize,useBias,init));
        return this;
    }

    public Layers addLstmLayer(int inputSize, int hiddenSize, boolean useBias,Initializer init){
        layers.add(LayerFactory.LstmLayer(inputSize,hiddenSize,useBias,init));
        return this;
    }

    public Layers addGRULayer(int inputSize, int hiddenSize, boolean useBias,Initializer init){
        layers.add(LayerFactory.GRULayer(inputSize,hiddenSize,useBias,init));
        return this;
    }

    public HashSet<Tensor> parameters(){
        HashSet <Tensor> params=new HashSet<>();
        for(Layer layer:layers){
            params.addAll(layer.parameters());
        }
        return params;
    }

    public HashSet<MemoryState> memoryList(){
        HashSet <MemoryState> memoryStateList =new HashSet<>();
        for(Layer layer:layers){
            memoryStateList.addAll(layer.memoryList());
        }
        return memoryStateList;
    }



}
